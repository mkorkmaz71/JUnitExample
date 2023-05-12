package com.automation.test;

import com.automation.categories.RegressionTest;
import com.automation.categories.SanityTest;
import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class OrderCancellationTest extends BaseTest {
    @Test
    @Category({RegressionTest.class, SmokeTest.class, SanityTest.class})
    public  void  verifyUserCanListOrders(){
        System.out.println("verify user can list all the orders");
    }
    @Test
    @Category({RegressionTest.class, SanityTest.class})
    public  void  verifyUserCanCancelTheOrder(){
        System.out.println("verify user can cancel the order");
    }
    @Test
    @Category({RegressionTest.class})
    public  void  verifyUserCanReviseTheOrder(){
        System.out.println("verify user can revise the order");
    }


}
