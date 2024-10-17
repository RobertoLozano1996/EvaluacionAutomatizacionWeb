package com.nttdata.steps;

import com.nttdata.page.MyStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreSteps {
    WebDriver driver;

    public MyStoreSteps(WebDriver driver){

        this.driver = driver;
    }

    public void clickCategoria() {
        WebElement categoria = driver.findElement(MyStorePage.categoria);
        categoria.click();
    }

    public void clickSubCategoria() {
        WebElement subCategoria = driver.findElement(MyStorePage.subCategoria);
        subCategoria.click();
    }
}
