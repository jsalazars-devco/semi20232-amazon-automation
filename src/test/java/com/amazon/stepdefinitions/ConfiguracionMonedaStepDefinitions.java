package com.amazon.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.LOGO;
import static com.amazon.page.ConfiguracionPage.*;
import static com.amazon.page.PieDePaginaPage.BTN_CONFIG_MONEDA;

public class ConfiguracionMonedaStepDefinitions {
    @Cuando("{actor} cambia la configuracion de moneda a {string}")
    public void canmbioConfiguracionMoneda(Actor actor, String moneda) {
        actor.attemptsTo(
                Open.url("https://www.amazon.com"),
                Click.on(LOGO),
                Click.on(BTN_CONFIG_MONEDA),
                Click.on(BTN_OPCIONES_MONEDA),
                Click.on(OpcionMoneda(moneda)),
                Click.on(BTN_GUARDAR_CAMBIOS)
        );
    }

    @Entonces("debe verse la configuracion de moneda {string}")
    public void comparoConfiguracionMoneda(String moneda) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(BTN_CONFIG_MONEDA).text().isEqualTo(moneda)
        );
    }
}