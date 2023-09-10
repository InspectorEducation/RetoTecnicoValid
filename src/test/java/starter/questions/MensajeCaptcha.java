package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import starter.user_interface.RegistrarUsuarioForm;

public class MensajeCaptcha implements Question<Boolean> {
    public static Question<Boolean> msjCaptcha (){ return new MensajeCaptcha();}

    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(RegistrarUsuarioForm.MENSAJE_CAPTCHA));
    }
}
