package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target INPUT_BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("twotabsearchtextbox"));
    public static Target BUT_CARRITO = Target.the("boton carrito").located(By.id("nav-cart"));
    public static Target TODO_MENU = Target.the("menu todo").located(By.id("nav-hamburger-menu"));
    public static Target TARJETAS_REGALO = Target.the("boton tarjetas de regalo").locatedBy("//div[.='Tarjetas de Regalo']/..");
    public static Target TARJETAS_REGALO_ELECTRONICAS = Target.the("link tarjetas de regalo electronicas").locatedBy("//a[contains(text(),'Tarjetas de regalo electr')]");
    public static Target LINK_LISTAS = Target.the("link listas").locatedBy("//a[@data-csa-c-content-id='nav_cs_registry']");
    public static Target LOGO = Target.the("link logo").locatedByFirstMatching("//a[contains(@id,'nav')][contains(@id,'logo')]");
    public static Target BTN_LOCACION = Target.the("link logo").located(By.id("nav-global-location-popover-link"));
    public static Target INPUT_CODIGO_POSTAL = Target.the("link logo").located(By.id("GLUXZipUpdateInput"));
    public static Target BTN_APLICAR = Target.the("boton aplicar codigo postal").locatedBy("//span[@data-action='GLUXPostalUpdateAction']/input");
    public static Target BTN_CONTINUAR = Target.the("boton continuar codigo postal").locatedBy("//div[@class='a-popover-footer']//input[@id='GLUXConfirmClose']");
    public static Target CIUDAD_LOCACION = Target.the("link logo").locatedBy("//a[@id='nav-global-location-popover-link']//span[contains(@class, 2)]");
}