package starter.user_interface;

import org.openqa.selenium.By;

public class PaginaHistorialForm {
    public static By OPCION_3_RADIO_BUTTON = By.xpath("//section[@id='pagehistory']/ul[3]/li/input[1]");
    public static By BOTON_COMPARAR_VERSIONES = By.xpath("//*[@id='mw-history-compare']/div/input");
    public static By COMPONENTE_VERSION_ANTERIOR = By.xpath("//td[@class='diff-otitle diff-side-deleted']");
    public static By COMPONENTE_VERSION_NUEVA = By.xpath("//td[@class='diff-ntitle diff-side-added']");
}
