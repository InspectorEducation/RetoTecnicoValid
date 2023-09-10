package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.user_interface.RegistrarUsuarioForm;

public class RegistrarUsuario {
    public static Performable registrarUsuario(String usuario, String contrasena, String correo) {
        return Task.where("Registrar usuario",
                Enter.theValue(usuario).into(RegistrarUsuarioForm.CAMPO_USUARIO),
                Enter.theValue(contrasena).into(RegistrarUsuarioForm.CAMPO_CONTRASENA),
                Enter.theValue(contrasena).into(RegistrarUsuarioForm.CAMPO_CONFIRMAR_CONTRASENA),
                Enter.theValue(correo).into(RegistrarUsuarioForm.CAMPO_CORREO),
                Click.on(RegistrarUsuarioForm.BOTON_CREAR_CUENTA)
        );
    }

}
