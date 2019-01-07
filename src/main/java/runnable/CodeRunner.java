/**
 * 
 */
package runnable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author sivaram
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/feature/",glue="stepDefinition")

public class CodeRunner {

}
