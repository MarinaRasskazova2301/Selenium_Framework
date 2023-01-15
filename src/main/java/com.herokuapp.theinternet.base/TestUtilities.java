package com.herokuapp.theinternet.base;

import com.herokuapp.theinternet.base.BaseTest;


public class TestUtilities extends BaseTest {

    protected void  sleep(long millis){

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
           // throw new RuntimeException(e);
            e.printStackTrace();
        }
    }


}
