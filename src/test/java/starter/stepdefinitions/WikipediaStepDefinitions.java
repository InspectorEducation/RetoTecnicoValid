package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.navigation.NavigateTo;
import starter.questions.*;
import starter.questions.pagina_version.VersionAnteriorPresente;
import starter.questions.pagina_version.VersionNuevaPresente;
import starter.tasks.BuscarTermino;
import starter.tasks.CambiarVersionMovilesOEscritorio;
import starter.tasks.RegistrarUsuario;
import starter.user_interface.PaginaBienvenidaForm;
import starter.user_interface.PaginaHistorialForm;
import starter.user_interface.PaginaSistemaForm;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class WikipediaStepDefinitions {

    @Managed
    WebDriver driver;

    Actor cliente = Actor.named("Cliente");

    @Before
    public void setupActor(){
        cliente.can(BrowseTheWeb.with(driver));
    }

    //*********Escenario 01*********
    @Given("El usuario ingresa a la pagina Wikipedia")
    public void navigateUrl(){
        cliente.wasAbleTo(NavigateTo.TheWikiHomePage());
    }

    @When("El usuario ingresa a la pagina principal de Wikipedia")
    public void el_usuario_ingresa_a_la_pagina_de_principal_de_Wikipedia() {
        cliente.attemptsTo(
                Click.on(PaginaBienvenidaForm.BOTON_PAGINA_INICIO)
        );
    }
    @Then("El usuario debe visualizar el titulo {string}")
    public void el_usuario_da_clic_en_el_boton_join_to_day_y_diligencia_la_siguiente_informacion_personal(String msj) {
        cliente.should(
                seeThat("Debe cargar el mensaje de bienvenida", MensajePaginaBienvenida.paginaBienvenida(),equalTo(msj))
        );
    }


    //*********Escenario 02*********
    @When("El usuario busca el termino {string}")
    public void  El_usuario_busca_el_termino (String termino){
        cliente.attemptsTo(BuscarTermino.buscarTermino(termino));
    }

    @Then("El usuario debe visualizar el titulo de la busqueda {string}")
    public void El_usuario_debe_visualizar_el_titulo_de_la_busqueda(String msj){
        cliente.should(
                seeThat("Debe visualizar el mensaje Sistema", MensajePaginaSistema.msjPaginaSistema(), equalTo(msj))
        );
    }


    //*********Escenario 03*********
    @When("El usuario hace scroll hasta la parte inferior")
    public void El_usuario_hace_scroll_hasta_la_parte_inferior(){
        cliente.attemptsTo(
                Scroll.to(PaginaSistemaForm.MENSAJE_ANALISIS_CEEM)
        );
    }

    @Then("El usuario debe visualizar el mensaje {string}")
    public void El_usuario_debe_visualizar_el_mensaje(String msj){
        cliente.should(
                seeThat("Debe visualizar el mensaje "+msj, MensajeAnalisisCEEM.msjAnalisisCEEM(),equalTo(msj))
        );
    }


    //*********Escenario 04*********
    @When("El usuario da clic al boton crear cuenta")
    public void El_usuario_da_clic_al_boton_crear_cuenta(){
        cliente.attemptsTo(
                Click.on(PaginaBienvenidaForm.BOTON_CREAR_CUENTA)
        );
    }

    @When("El usuario llena el formulario de registro con los siguientes datos {string}, {string}, {string} y envia el formulario")
    public void el_usuario_llena_el_formulario_de_registro_con_los_siguientes_datos(String usuario, String contrasena, String correo) {
        cliente.attemptsTo(RegistrarUsuario.registrarUsuario(usuario,contrasena,correo));
    }

    @Then("El usuario debe visualizar el pop up del captcha requerido")
    public void el_usuario_debe_visualizar_el_pop_up_del_captcha_requerido() {
        cliente.should(
              seeThat("Debe visualizar el pop up",MensajeCaptcha.msjCaptcha())
        );
    }


    //*********Escenario 05*********
    @When("El usuario hace scroll y da clic en la opcion version para moviles")
    public void el_usuario_hace_scroll_y_da_clic_en_la_opcion_version_para_moviles() {
        cliente.attemptsTo(CambiarVersionMovilesOEscritorio.modificarVersion("moviles"));
    }

    @Then("El usuario debe visualizar la opcion de version para escritorio")
    public void el_usuario_debe_visualizar_la_opcion_de_version_para_escritorio() {
        cliente.should(
                seeThat("Debe visualizar la opcion de version para escritorio", OpcionParaMoviles.opcionParaMovilesPresente())
        );
    }
    @Then("El usuario regresa a la opcion para moviles")
    public void el_usuario_regresa_a_la_opcion_para_moviles() {
        cliente.attemptsTo(CambiarVersionMovilesOEscritorio.modificarVersion("escritorio"));
    }


    //*********Escenario 06*********
    @When("El usuario selecciona la opcion Ver historial")
    public void el_usuario_selecciona_la_opcion_ver_historial() {
        cliente.attemptsTo(
                Click.on(PaginaBienvenidaForm.OPCION_VER_HISTORIAL)
        );
    }
    @When("El usuario selecciona una version a comparar y da clic sobre el boton Comparar versiones seleccionadas")
    public void el_usuario_selecciona_una_version_a_comparar_y_da_clic_sobre_el_boton_comparar_versiones_seleccionadas() {
        cliente.attemptsTo(
                Click.on(PaginaHistorialForm.OPCION_3_RADIO_BUTTON),
                Click.on(PaginaHistorialForm.BOTON_COMPARAR_VERSIONES)
        );
    }
    @When("El usuario debe visualizar la dos versiones de la pagina")
    public void el_usuario_debe_visualizar_la_dos_versiones_de_la_pagina() {
        cliente.should(
                seeThat("Debe visualizar la version anterior", VersionAnteriorPresente.componenteVersionAnterior()),
                seeThat("Debe visualizar la version nueva", VersionNuevaPresente.componenteVersionNueva())
        );
    }

}
