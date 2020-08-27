package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

//    @Before testNG'deki @BeforeMethod gibi calisir,
//    Her scenario'dan once calisir
// *** ONEMLI *** cucumber'dan gelen @Before'u kullaniyoruz

// *** (order ) ==> onceligi belirler. testNG'deki priority ile ayni gorevi Cucumber framework'da yapiyor

//  GLOBAL Hooks annotation ==> ilk @Before'a verilen isim
    @Before(order = 1)
    public void setup(){
        System.out.println("Hooks Class-Setup Method");

    }

//    her ozel(spesifik) scenario'dan once calisir.
//  TAGGED Hooks annotation ==> sonraki @Before'lara verilen isim
    @Before (value = "@teapot", order = 2)
    public void searchTeapot(){
        System.out.println("Hook Class- Teapot Method");
    }
// *** ONEMLI *** cucumber'dan gelen @After'i kullaniyoruz
//  @After ==> her scenario'dan sonra calisir
    @After
    public void tearDown(Scenario scenario){
        System.out.println("Hooks Class - tearDown Method");

//        screenshot almak icin ===> *** fail olursa
        final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

//        Her fail olan Scenario'dan sonra screenshot almaliyiz
//        Scenario fail olursa image ekleyelim
        if(scenario.isFailed()){
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();
    }

}
