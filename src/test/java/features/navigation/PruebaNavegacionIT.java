/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.navigation;


import model.Category;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.NavigatinUser;

/**
 *
 * @author mcetsqa
 */
@RunWith(SerenityRunner.class)
public class PruebaNavegacionIT {
    
    @Steps
    NavigatinUser mark;
    
    @Managed
    WebDriver browser;
    
    @Test
    public void shouldBeAbleToNavigationToTheMotorsCategory() {
       //GIVEN
       mark.isOnTheHomePage(); 
       //WHEN
       mark.navigatesToCategory(Category.motores);
       //Then
       mark.shouldSeePageTitleContaining("Autos, motos y otros");
    }
    
    
}
