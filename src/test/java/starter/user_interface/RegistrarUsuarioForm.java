package starter.user_interface;

import org.openqa.selenium.By;

public class RegistrarUsuarioForm {
    public static By CAMPO_USUARIO = By.xpath("//input[@id='wpName2']");
    public static By CAMPO_CONTRASENA = By.xpath("//input[@id='wpPassword2']");
    public static By CAMPO_CONFIRMAR_CONTRASENA = By.xpath("//input[@id='wpRetype']");
    public static By CAMPO_CORREO = By.xpath("//input[@id='wpEmail']");
    public static By BOTON_CREAR_CUENTA = By.xpath("//button[@id='wpCreateaccount']");
    public static By MENSAJE_CAPTCHA = By.cssSelector("*[name = \"userlogin2\"] > div:nth-of-type(1)");
}
