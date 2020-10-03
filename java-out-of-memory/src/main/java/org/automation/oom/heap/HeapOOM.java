package org.automation.oom.heap;

import org.automation.oom.Test;
import org.automation.oom.Util;

/**
 * @author sarker.shantonu@gmail.com
 * @created 10/3/2020
 */
public class HeapOOM {
    public void oomByMem() throws Exception {
        int arraySize = 2, loop=1;
        Util.showMemoryInfo();
        while(true){
            System.out.print("\nIteration " + loop++);
            Util.showMemoryInfo();
            int[] fillupmemory = new int[arraySize];
            arraySize*=2;
            System.out.println("\nIteration Ends");
            Thread.sleep(3000);
        }
    }
}
