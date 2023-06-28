package com.amazon;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/seleccionar_regalo_y_agregar.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuite {}
