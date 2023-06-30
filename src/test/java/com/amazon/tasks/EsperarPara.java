package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.amazon.page.CabeceraPage.*;

public class EsperarPara {
    public static Performable clickBotonCarrito() {
        return Task.where("click en el boton carrito de compras",
                WaitUntil.the(BUT_CARRITO, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BUT_CARRITO)
        );
    }

    public static Performable clickTarjetasRegaloElectronicas() {
        return Task.where("click en tarjetas de regalo electronicas",
                WaitUntil.the(TARJETAS_REGALO_ELECTRONICAS, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                Click.on(TARJETAS_REGALO_ELECTRONICAS)
        );
    }
}