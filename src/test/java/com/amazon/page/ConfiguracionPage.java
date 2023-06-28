package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfiguracionPage {
    public static Target BTN_OPCIONES_MONEDA = Target.the("menu opciones moneda").located(By.id("icp-currency-dropdown-selected-item-prompt"));
    public static Target OpcionMoneda(String moneda) {
        return Target.the("opción configuracion de moneda").located(By.id(moneda));
    }
    public static Target BTN_GUARDAR_CAMBIOS = Target.the("botón guardar cambios").locatedBy("//span[@id='icp-save-button']//input");
}