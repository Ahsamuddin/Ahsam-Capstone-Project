package stepDef;

import Core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base{
	@Before
	public void beforeHooks(Scenario scenario){
		logger.info("Scenario" + scenario.getName()+ "Started");
		selectBrowser();
		openBrowser();
		}
	@After
	public void afterHook(Scenario scenario){
		driver.quit();
		logger.info("Scenario "+ scenario.getName()+ scenario.getStatus());
		
	}
}
