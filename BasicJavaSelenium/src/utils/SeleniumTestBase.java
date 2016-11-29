package utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

public abstract class SeleniumTestBase {
	private WebDriver driver;
	private EventFiringWebDriver eventDriver;
	private long implicitlyWaitSecond;
	private long explicitlyWaitSecond;
	private Logger log = Logger.getLogger(SeleniumTestBase.class);
	private static Map<ITestResult, List<Throwable>> verificationFailuresMap = new HashMap<ITestResult, List<Throwable>>();
}
