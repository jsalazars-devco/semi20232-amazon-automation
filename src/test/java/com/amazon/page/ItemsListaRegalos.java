package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ItemsListaRegalos {
    public static Target ITEM_LISTA_REGALOS = Target.the("item lista de regalos").locatedBy("//div[@aria-labelledby]");
    public static Target BTN_AGREGAR_CARRITO = Target.the("boton agregar al carrito").locatedBy("//span[contains(@class,'add-to-cart')]//button");
}
