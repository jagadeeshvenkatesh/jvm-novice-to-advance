package org.automation.oom;

/**
 * @author sarker.shantonu@gmail.com
 * @created 10/3/2020
 */
public class Util {
    public static void showMemoryInfo()
    {
        System.out.print("\nTotal memory : "+Runtime.getRuntime().totalMemory());
        System.out.print(" Free : "+Runtime.getRuntime().freeMemory());
        System.out.print(" Max : "+Runtime.getRuntime().maxMemory()+"\n\n");
    }
}
