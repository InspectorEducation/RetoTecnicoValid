package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.user_interface.PaginaSistemaForm;

public class MensajeAnalisisCEEM implements Question<String> {
    public static Question<String> msjAnalisisCEEM (){ return new MensajeAnalisisCEEM();}

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(PaginaSistemaForm.MENSAJE_ANALISIS_CEEM).getText();
    }
}
