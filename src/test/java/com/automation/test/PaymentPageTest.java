package com.automation.test;

import com.automation.categories.RegressionTest;
import com.automation.categories.SanityTest;
import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PaymentPageTest extends BaseTest{
    @Test
    @Category({RegressionTest.class, SmokeTest.class, SanityTest.class})
    public  void  verifyUserCanAddPaymentMethod(){
        System.out.println("verify user can add a payment method");
    }
    @Test
    @Category({RegressionTest.class, SanityTest.class})
    public  void  verifyUserCanRemovePaymentMethod(){
        System.out.println("verify user can remove a payment method");
    }
    @Test
    @Category({RegressionTest.class, SmokeTest.class})
    public  void  verifyUserCanPayTheBalance(){
        System.out.println("verify user can pay the balance");
    }
}
