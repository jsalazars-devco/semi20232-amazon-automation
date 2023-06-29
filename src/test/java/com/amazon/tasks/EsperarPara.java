package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static com.amazon.page.CabeceraPage.BUT_CARRITO;

public class EsperarPara {
    public static Performable clickBotonCarrito() {
        try {
            Thread.sleep(Duration.ofMillis(5000).toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Task.where("click en el boton carrito de compras",
                Click.on(BUT_CARRITO)
        );
    }
}