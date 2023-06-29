package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.EsperarPara;
import com.amazon.tasks.ClickLogo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CarritoPage.LIST_ITEMS;
import static com.amazon.page.ResultadosBusqueda.BTN_CERRAR_MODAL_LATERAL;

public class AgregarCarritoStepDefinitions {

    @Cuando("agrego un {string} al carrito")
    public void agregoUnItemAlCarrito(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                ClickLogo.clickLogo(),
                BuscarItem.conEnvioColombia(item),
                Click.on(BTN_CERRAR_MODAL_LATERAL)
        );
    }

    @Entonces("debe verse {int} item(s) en el carrito de compras")
    public void verNumeroItemsEnCarrito(Integer numeroitems) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EsperarPara.clickBotonCarrito(),
                Ensure.that(LIST_ITEMS).textValues().hasSize(numeroitems)
        );
    }

    @Cuando("{actor} agrega al carrito los items")
    public void agregarVariosItemsCarrito(Actor actor, io.cucumber.datatable.DataTable dataTable) {
        actor.attemptsTo(Open.url("https://www.amazon.com"));
        dataTable.asList().stream().forEach( item -> {
            actor.attemptsTo(BuscarItem.conEnvioColombia(item));
        });
    }
}