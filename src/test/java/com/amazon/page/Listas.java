package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class Listas {
    public static Target INPUT_NOMBRE_REGISTRANTE = Target.the("input buscar el nombre del registrante").locatedBy("//div[@class='gr-find-stripe-form-container']//input");
    public static Target OPCION_LISTA_REGALOS = Target.the("opción para elegir lista de regalos").locatedBy("//option[@value='/registries/search?name=']");
    public static Target BTN_BUSCAR = Target.the("boton buscar lista de regalos").locatedBy("//button");
}
