package com.nttdata.steps;

import com.nttdata.page.ProductoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvMyStoreSteps {
    WebDriver driver;
    public InvMyStoreSteps(WebDriver driver){
        this.driver = driver;
    }

    public void clickProducto() {
        WebElement producto = driver.findElement(ProductoPage.producto);
        producto.click();
    }

    public void escribirUnidades(String unidades) {
        WebElement unidadeInput = driver.findElement(ProductoPage.unidadInput);
        unidadeInput.sendKeys(unidades);
    }

    public void clickAgregar() {
        WebElement buttonProduct = driver.findElement(ProductoPage.Buttonproduct);
        buttonProduct.click();
    }

    public void clickValidar() {
        WebElement buttonValidar = driver.findElement(ProductoPage.ButtonConfirmar);
        buttonValidar.click();
    }

    public void clickFinal() {
        WebElement buttonFinal = driver.findElement(ProductoPage.ButtonFinal);
        buttonFinal.click();
    }
}
