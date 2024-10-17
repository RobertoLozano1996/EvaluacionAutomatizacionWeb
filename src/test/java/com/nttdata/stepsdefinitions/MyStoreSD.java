package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InvMyStoreSteps;
import com.nttdata.steps.LoginMyStoreSteps;
import com.nttdata.steps.MyStoreSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;

public class MyStoreSD {
    WebDriver driver;
    @Given("estoy en la página de la tienda")
    public void estoyEnLaPáginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/es/iniciar-sesion");
    }

    @And("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String usuario, String clave) {

        LoginMyStoreSteps login = new LoginMyStoreSteps(driver);
        login.escribirUsuario(usuario);
        login.escribirClave(clave);
        login.clickSubmit();

    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String categoria, String subCategoria) {

        MyStoreSteps category = new MyStoreSteps(driver);
        category.clickCategoria();
        category.clickSubCategoria();

    }

    @And("agrego {string} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(String unidades) {

        InvMyStoreSteps producto = new InvMyStoreSteps(driver);
        producto.clickProducto();
        producto.escribirUnidades(unidades);
        producto.clickAgregar();
    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregado() {
        InvMyStoreSteps validar = new InvMyStoreSteps(driver);
        validar.clickValidar();

    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        InvMyStoreSteps finalizar = new InvMyStoreSteps(driver);
        finalizar.clickFinal();
    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
    }

    @And("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
    }
}
