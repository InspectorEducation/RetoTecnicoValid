package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.user_interface.PaginaHistorialForm;

public class SeleccionrVersionPagina {
    public static Performable seleccionarVersionPagina(){
        return Task.where("Seleccionar la version de la pagina",
                Click.on(PaginaHistorialForm.OPCION_3_RADIO_BUTTON)
        );
    }
}
