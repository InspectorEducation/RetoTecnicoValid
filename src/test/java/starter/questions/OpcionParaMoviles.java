package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import starter.user_interface.PaginaBienvenidaForm;

public class OpcionParaMoviles implements Question<Boolean> {
    public static Question<Boolean> opcionParaMovilesPresente(){ return new OpcionParaMoviles();}

    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(PaginaBienvenidaForm.OPCION_VERSION_ESCRITORIO));
    }
}
