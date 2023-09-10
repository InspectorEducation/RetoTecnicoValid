package starter.user_interface;

import org.openqa.selenium.By;

public class PaginaBienvenidaForm {
    public static By MENSAJE_PAGINA_BIENVENIDA = By.xpath("//span[@id='Bienvenidos_a_Wikipedia,']");
    public static By BOTON_PAGINA_INICIO = By.xpath("(//a[@href='/wiki/Wikipedia:Portada'])[2]");
    public static By BOTON_CREAR_CUENTA = By.xpath("//li[@id='pt-createaccount-2']//span[contains(text(),'Crear una cuenta')]");
    public static By OPCION_VERSION_MOVILES = By.xpath("//a[@class='noprint stopMobileRedirectToggle']");
    public static By OPCION_VERSION_ESCRITORIO = By.xpath("//a[@id='mw-mf-display-toggle']");
    public static By OPCION_VER_HISTORIAL = By.xpath("//li[@id='ca-history']//a//span");
}
