package org.automation.oom.gc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sarker.shantonu@gmail.com
 * @created 10/3/2020
 */
public class GCOverhead {
    private static Map aMap = new HashMap();//I am using map as it is easy to occupy memory, if you use arraylist, it will be longer time
    public static void createGCOverheadOOM(){
        int i = 0;
        try{
            while (true) {
                aMap.put(i, "Shantonu adding String");
                System.out.println("Total Items "+i++);
            }
        }catch(Throwable e){
            System.err.println("\nError after adding "+ aMap.size()+" items");
            e.printStackTrace();
        }
    }
}
