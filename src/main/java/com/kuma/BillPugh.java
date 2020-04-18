package com.kuma;

/**
 * Created by bearhsu2 on 10/10/2016.
 */
public class BillPugh {
    public BillPugh getInstance(){
        return BillPughHelper.INSTANCE;
    }

    private static class BillPughHelper{
        private static final BillPugh INSTANCE = new BillPugh();
    }
}
