package org.automation.oom.permgen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Main credit https://www.javacodegeeks.com/user/pierre-hugues-charbonneau
 * @author sarker.shantonu@gmail.com
 * @created 10/3/2020
 */
public class MyInterfaceInvocationHandler implements InvocationHandler {
    private MyClass myObject;

    public MyInterfaceInvocationHandler(Object myObject) {
        this.myObject = (MyClass)myObject;
    }

    @Override
    public Object invoke(Object invocationProxy, Method method, Object[] arguments) throws Throwable {
        if(Object.class==method.getDeclaringClass())//checking if the method is valid member of a class
        {
            String name = method.getName();
            if("equals".equals(name))//checking presence of equal method
            {
                return invocationProxy==arguments[0];
            }
            else if("hashCode".equals(name))//checking presence of hashCode method
            {
                return System.identityHashCode(invocationProxy);
            }
            else if("toString".equals(name))//checking presence of toString method
            {
                return invocationProxy.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(invocationProxy))+
                        ", with invocation handler "+this;
            }
        }
        else{
            throw new IllegalStateException(String.valueOf(method));
        }
        return method.invoke(myObject, arguments);//calling the method
    }
}
