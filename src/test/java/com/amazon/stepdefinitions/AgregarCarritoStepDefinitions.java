package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.ClickLogo;
import com.amazon.tasks.SeleccionarItem;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

import static com.amazon.page.CabeceraPage.BUT_CARRITO;
import static com.amazon.page.CabeceraPage.INPUT_BARRA_BUSQUEDA;
import static com.amazon.page.CarritoPage.LIST_ITEMS;

public class AgregarCarritoStepDefinitions {

    @Cuando("agrego un {string} al carrito")
    public void agregoUnItemAlCarrito(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                ClickLogo.clickLogo(),
                BuscarItem.conEnvioColombia(item)
        );
    }

    @Entonces("debe verse {int} item(s) en el carrito de compras")
    public void verNumeroItemsEnCarrito(Integer numeroitems) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BUT_CARRITO),
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