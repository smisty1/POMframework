package steps_of_Parametarization;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features= "src/test/java/parametarization.features" ,
glue = "steps_of_Parametarization"


//snippets = SnippetType.CAMELCASE
)



public class TestRunner extends AbstractTestNGCucumberTests {

}
