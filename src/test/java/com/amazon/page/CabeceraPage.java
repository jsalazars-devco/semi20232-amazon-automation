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
    public static Target LOGO = Target.the("link logo").located(By.id("nav-logo-sprites"));
}