package com.automation.runner;

import com.automation.test.OrderCancellationTest;
import com.automation.test.PaymentPageTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({OrderCancellationTest.class, PaymentPageTest.class})
public class TestRunner {
}
