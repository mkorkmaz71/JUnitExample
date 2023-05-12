package com.automation.runner;

import com.automation.categories.RegressionTest;
import com.automation.categories.SmokeTest;
import com.automation.test.OrderCancellationTest;
import com.automation.test.PaymentPageTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({OrderCancellationTest.class, PaymentPageTest.class})
@Categories.IncludeCategory(SmokeTest.class)
public class GroupRunner {
}
