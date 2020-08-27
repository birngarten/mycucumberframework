package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@testcase3",
        dryRun = false
)
public class Runner {
}

//@RunWith(Cucumber.class)    // ==> class'i cucumber ile calistir(run)
//@CucumberOptions(
//        plugin = "html:target/cucumber", // *** plugin ==> html raporlarini almamizi sagliyor
//        features = "src\\test\\resources\\features",
//            glue = "stepdefinitions",    // *** glue ==> features ve stepdefinitions'i birbirine baglar
//            tags = "@wait",  // *** Hangi tag'i calistirmak istiyorsak onun adini yazilir
//          dryRun = false
// ***  dryRun = true  ==> boyle yazdigimizda web'i acmayacak sadece consolda ignore olan method'lari yazar
// ***  Runner class'ta son satir haric her satirdan sonra virgul(,)kullaniyoruz
