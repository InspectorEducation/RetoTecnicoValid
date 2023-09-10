package starter.user_interface;

import org.openqa.selenium.By;

public class PaginaSistemaForm {
    public static By BUSCADOR_PAGINA_INICIO = By.xpath("//input[@placeholder='Buscar en Wikipedia']");
    public static By MENSAJE_PAGINA_SISTEMA = By.xpath("//span[@class='mw-page-title-main']");
    public static By MENSAJE_ANALISIS_CEEM = By.xpath("//h3[3]/span[2]");
}
