package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.user_interface.PaginaSistemaForm;

public class MensajePaginaSistema implements Question<String> {
    public static Question<String> msjPaginaSistema (){ return new MensajePaginaSistema();}

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(PaginaSistemaForm.MENSAJE_PAGINA_SISTEMA).getText();
    }
}
