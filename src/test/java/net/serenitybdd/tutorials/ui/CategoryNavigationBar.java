/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.serenitybdd.tutorials.ui;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import model.Category;

/**
 *
 * @author mcetsqa
 */
public class CategoryNavigationBar extends PageObject{

    public void selectCategory(Category category) {
        $("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();
    }
    
}
