package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.user_interface.PaginaBienvenidaForm;

public class MensajePaginaBienvenida implements Question<String> {
public static Question<String> paginaBienvenida (){ return new MensajePaginaBienvenida();}

    @Override
    public String answeredBy(Actor actor) {
        String msj_web = BrowseTheWeb.as(actor).find(PaginaBienvenidaForm.MENSAJE_PAGINA_BIENVENIDA).getText();
        return msj_web.substring(0,23);
    }
}
