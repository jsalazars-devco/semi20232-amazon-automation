package com.amazon.stepdefinitions;

import com.amazon.tasks.EsperarPara;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.DetalleItem.*;
import static com.amazon.page.ResultadosBusqueda.ITEM_TARJETA_REGALO;

public class AgregarTajetaRegaloStepDefinitions {

    @Cuando("busco una tarjeta de regalo")
    public void buscoUnaTargetaRegalo() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                Click.on(LOGO),
                Click.on(TODO_MENU),
                Click.on(TARJETAS_REGALO),
                EsperarPara.clickTarjetasRegaloElectronicas(),
                Click.on(ITEM_TARJETA_REGALO)
        );
    }

    @Y("quiero comprarla de {int} dolares para el correo {string} y agregarla al carrito")
    public void agregoLosDatosTarjetaRegalo(Integer cantidad_dolares, String correo) {
        String dolares = String.valueOf(cantidad_dolares);
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(correo).into(INPUT_CORREO_DESTINATARIO),
                Enter.theValue(dolares).into(INPUT_CANTIDAD_DOLARES),
                Click.on(BUT_AGREGAR_CARRITO_TARGETA_REGALO)
        );
    }
}