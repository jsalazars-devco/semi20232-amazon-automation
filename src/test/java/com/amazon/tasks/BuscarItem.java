package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.amazon.page.CabeceraPage.INPUT_BARRA_BUSQUEDA;
import static com.amazon.page.DetalleItem.BUT_AGREGAR_CARRITO;
import static com.amazon.page.ResultadosBusqueda.*;

public class BuscarItem {
    public static Performable conEnvioColombia(String item) {
        try {
            Thread.sleep(Duration.ofMillis(5000).toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Task.where("{0} buscando el item ´" + item + "´ con envío a Colombia",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItem.conEnvioColombia()
        );
    }

    public static Performable conFiltro(String item, Integer minvalue, Integer maxvalue) {
        return Task.where("{0} buscando el item ´" + item,
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                Enter.theValue(String.valueOf(minvalue)).into(INPUT_VALOR_MINIMO),
                Enter.theValue(String.valueOf(maxvalue)).into(INPUT_VALOR_MAXIMO),
                Click.on(BTN_APLICAR_FILTRO),
                Click.on(ITEM_COMPRA)
        );
    }
}