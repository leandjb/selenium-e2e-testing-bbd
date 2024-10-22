package runners;


@RunWith(Cucumber.class)
@CucumberOptions(
    features="app\\src\\test\\resources\\features",
    glue="app\\src\\test\\java\\steps"
    plugin= {"pretty","html:target/cucumber-reports"}
)


public class TestRunner {
    
}
