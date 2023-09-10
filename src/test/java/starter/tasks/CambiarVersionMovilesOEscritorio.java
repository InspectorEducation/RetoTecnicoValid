package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.user_interface.PaginaBienvenidaForm;

public class CambiarVersionMovilesOEscritorio {
    public static Performable modificarVersion(String version){
        if(version.equals("moviles")){
            return Task.where("Buscar la opcion para moviles",
                    Scroll.to(PaginaBienvenidaForm.OPCION_VERSION_MOVILES),
                    Click.on(PaginaBienvenidaForm.OPCION_VERSION_MOVILES)
            );
        }else {
            return Task.where("Buscar la opcion para Escritorio",
                    Scroll.to(PaginaBienvenidaForm.OPCION_VERSION_ESCRITORIO),
                    Click.on(PaginaBienvenidaForm.OPCION_VERSION_ESCRITORIO));
        }
    };
}
