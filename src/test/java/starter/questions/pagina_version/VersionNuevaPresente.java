package starter.questions.pagina_version;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import starter.user_interface.PaginaHistorialForm;

public class VersionNuevaPresente implements Question<Boolean> {
    public static Question<Boolean> componenteVersionNueva (){ return new VersionNuevaPresente();}

    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(PaginaHistorialForm.COMPONENTE_VERSION_NUEVA));
    }
}
