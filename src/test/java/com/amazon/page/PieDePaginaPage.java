package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PieDePaginaPage {
    public static Target BTN_CONFIG_MONEDA = Target.the("boton configuracion de moneda").locatedBy("//span[@class='icp-currency-symbol']");
}