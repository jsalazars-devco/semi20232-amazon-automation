package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.ClickLogo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.DetalleItem.*;
import static com.amazon.page.ResultadosBusqueda.ITEM_TARJETA_REGALO;

public class VerificarPrecioItemStepDefinitions {

    @Cuando("busco {string} y filtro los precios entre {int} y {int}")
    public void buscoUnItemConFiltro(String item, Integer minvalue, Integer maxvalue) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                ClickLogo.clickLogo(),
                BuscarItem.conFiltro(item, minvalue, maxvalue)
        );
    }

    @Entonces("debe verse un precio entre {int} y {int} en el producto")
    public void comparoPrecioItem(Integer minvalue, Integer maxvalue) {
        Actor actor = OnStage.theActorInTheSpotlight();
        String precioText = BrowseTheWeb.as(actor).find(ITEM_PRECIO).getText();

        Integer precio = Integer.parseInt(precioText);

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(precio).isGreaterThanOrEqualTo(minvalue),
                Ensure.that(precio).isLessThan(maxvalue)
        );
    }
}