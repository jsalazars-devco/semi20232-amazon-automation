package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleItem {
    public static Target BUT_AGREGAR_CARRITO = Target.the("botón agregar carrito en detalle del item").located(By.id("add-to-cart-button"));
    public static Target INPUT_CANTIDAD_DOLARES = Target.the("input para agregar el valor de la tarjeta de regalo").located(By.id("gc-order-form-custom-amount"));
    public static Target INPUT_CORREO_DESTINATARIO = Target.the("input para agregar el correo de la tarjeta de regalo").located(By.id("gc-order-form-recipients"));
    public static Target BUT_AGREGAR_CARRITO_TARGETA_REGALO = Target.the("botón agregar carrito en detalle de la tarjeta de regalo").locatedBy("//input[@class='a-button-input']");
    public static Target ITEM_PRECIO = Target.the("precio del item").locatedBy("//span[@class='a-price-whole']");
}
