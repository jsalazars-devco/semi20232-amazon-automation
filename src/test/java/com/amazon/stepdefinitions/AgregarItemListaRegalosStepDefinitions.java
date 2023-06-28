package com.amazon.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.DetalleItem.*;
import static com.amazon.page.ItemsListaRegalos.BTN_AGREGAR_CARRITO;
import static com.amazon.page.ItemsListaRegalos.ITEM_LISTA_REGALOS;
import static com.amazon.page.Listas.*;
import static com.amazon.page.ListasRegalos.LINK_LISTA_REGALOS;
import static com.amazon.page.ResultadosBusqueda.ITEM_TARJETA_REGALO;

public class AgregarItemListaRegalosStepDefinitions {

    @Dado("que {actor} esta en la pagina de listas de amazon")
    public void buscoPaginaListas(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.amazon.com"),
                Click.on("//input[@data-action-type='DISMISS']"),
                Click.on(LINK_LISTAS)
        );
    }

    @Cuando("busca la lista de {string} y agrega un item al carrito de compras")
    public void agregoLosDatosTarjetaRegalo(String nombrelista) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(nombrelista).into(INPUT_NOMBRE_REGISTRANTE),
                Click.on(OPCION_LISTA_REGALOS),
                Click.on(BTN_BUSCAR),
                Click.on(LINK_LISTA_REGALOS),
                Click.on(ITEM_LISTA_REGALOS),
                Click.on(BTN_AGREGAR_CARRITO)
        );
    }
}