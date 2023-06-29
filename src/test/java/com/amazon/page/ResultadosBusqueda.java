package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA_ENVIO_COLOMBIA = Target.the("item buscado con envio a Colombia").locatedByFirstMatching("//span[contains(text(),'Colombia')]/ancestor::div[@data-csa-c-type='item']//img");
    public static Target ITEM_TARJETA_REGALO = Target.the("item buscado tarjeta de regalo electronica").locatedBy("//span[contains(text(),'eGift')]/ancestor::div[@class='a-section a-spacing-base']//h2/a");
    public static Target ITEM_COMPRA = Target.the("item buscado").locatedByFirstMatching("//div[@data-csa-c-type='item']//img");
    public static Target INPUT_VALOR_MINIMO = Target.the("valor minimo del filtro").located(By.id("low-price"));
    public static Target INPUT_VALOR_MAXIMO = Target.the("valor maximo del filtro").located(By.id("high-price"));
    public static Target BTN_APLICAR_FILTRO = Target.the("boton aplicar filtro").locatedBy("//input[@id='high-price']/following-sibling::*//input");
    public static Target BTN_CERRAR_MODAL_LATERAL = Target.the("boton cerrar modal lateral").located(By.id("attach-close_sideSheet-link"));
}