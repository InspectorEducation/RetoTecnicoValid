package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.user_interface.PaginaSistemaForm;

public class BuscarTermino {
    public static Performable buscarTermino(String termino){
        return Task.where("Buscar el termino"+termino,
                Enter.theValue(termino).into(PaginaSistemaForm.BUSCADOR_PAGINA_INICIO),
                Enter.theValue(Keys.ENTER).into(PaginaSistemaForm.BUSCADOR_PAGINA_INICIO)
        );
    }
}
