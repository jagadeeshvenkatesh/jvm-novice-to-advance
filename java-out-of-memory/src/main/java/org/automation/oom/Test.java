package org.automation.oom;

import org.automation.oom.heap.HeapOOM;

/**
 * @author sarker.shantonu@gmail.com
 * @created 10/3/2020
 */
public class Test {
    public static void main(String[] args) throws Exception {
        new HeapOOM().oomByMem(); // testing HeapOOM
        //TestPermGenMetaSpaceOOM.createPermGenOOM();
        //ThreadOOM.createOOMbyThread();
        //GCOverheadOOM.createGCOverheadOOM();
    }


}
