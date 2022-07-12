package TestNG;

import PageObjects.UkrPartsPageHelper;
import holders.TestInit;
import org.testng.annotations.Test;

public class TestPartsSearch extends TestInit {


    @Test
    public void ukrParts(){
        UkrPartsPageHelper ukrPartsPageHelper = new UkrPartsPageHelper(driver);
        ukrPartsPageHelper.goToHomePage();



    }
}
