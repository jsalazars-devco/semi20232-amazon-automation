package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA_ENVIO_COLOMBIA = Target.the("item buscado con envio a Colombia").locatedByFirstMatching("//span[contains(text(),'Colombia')]/ancestor::div[@data-csa-c-type='item']//img");
    public static Target ITEM_TARJETA_REGALO = Target.the("item buscado tarjeta de regalo electronica").locatedBy("//span[contains(text(),'eGift')]/ancestor::div[@class='a-section a-spacing-base']//h2/a");
}