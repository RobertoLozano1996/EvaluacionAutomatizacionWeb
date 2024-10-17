package com.nttdata.steps;

import com.nttdata.page.LoginMyStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginMyStoreSteps {

    WebDriver driver;
    public LoginMyStoreSteps(WebDriver driver){
        this.driver = driver;
    }
    public void escribirUsuario(String usuario) {
        WebElement usuarioInput = driver.findElement(LoginMyStorePage.userInput);
        usuarioInput.sendKeys(usuario);
    }

    public void escribirClave(String clave) {
        WebElement passInput = driver.findElement(LoginMyStorePage.passInput);
        passInput.sendKeys(clave);
    }

    public void clickSubmit() {
        WebElement loginButton = driver.findElement(LoginMyStorePage.loginButton);
        loginButton.click();
    }
}
