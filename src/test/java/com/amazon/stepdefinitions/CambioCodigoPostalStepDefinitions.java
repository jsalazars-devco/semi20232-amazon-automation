package com.amazon.stepdefinitions;

import com.amazon.tasks.ClickLogo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.ConfiguracionPage.*;
import static com.amazon.page.PieDePaginaPage.BTN_CONFIG_MONEDA;

public class CambioCodigoPostalStepDefinitions {
    @Cuando("{actor} cambia la ubicacion con el codigo postal {string}")
    public void cambioUbicacion(Actor actor, String codigopostal) {
        actor.attemptsTo(
                Open.url("https://www.amazon.com"),
                ClickLogo.clickLogo(),
                Click.on(BTN_LOCACION),
                Enter.theValue(codigopostal).into(INPUT_CODIGO_POSTAL),
                Click.on(BTN_APLICAR),
                Click.on(BTN_CONTINUAR)
        );
    }

    @Entonces("debe verse la ubicacion en {string}")
    public void comparoConfiguracionMoneda(String city) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(CIUDAD_LOCACION).text().contains(city)
        );
    }
}