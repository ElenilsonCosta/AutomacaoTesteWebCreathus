package modulo.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

@DisplayName("Realizar a busca por um valor de entrada")
public class RealizarBusca {

    @Test
    @DisplayName("Realizar busca pelo valor 69082640")
        public void testrealizarBuscaPorUmValor() {

            //Abrir o navegador
            System.setProperty("webdriver.chrome.driver", "C:\\drives\\chromedriver_win32 (1)\\chromedriver.exe");
            WebDriver navegador = new ChromeDriver();

            //maximixar o navegador
            navegador.manage().window().maximize();

            //vou definir um tempo de espera padrão de 5 segundos
            navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            //Navegar para a pagina Busca Cep
            navegador.get("https://buscacepinter.correios.com.br/app/endereco/index.php");

            //Fazer a busca com valor "69082640"
            navegador.findElement(By.id("endereco")).click();
            navegador.findElement(By.id("endereco")).sendKeys("69082640");
            navegador.findElement(By.id("btn_pesquisar")).click();

    }
    @Test
    @DisplayName("Realizar busca com o valor Instituto Creathus")
    public void testrealizarBuscavalorInstitutoCreathus() {

        //Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drives\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //maximixar o navegador
        navegador.manage().window().maximize();

        //vou definir um tempo de espera padrão de 5 segundos
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Navegar para a pagina Busca Cep
        navegador.get("https://buscacepinter.correios.com.br/app/endereco/index.php");

        //Fazer a busca com valor "69082640"
        navegador.findElement(By.id("endereco")).click();
        navegador.findElement(By.id("endereco")).sendKeys("Instituto Creathus");
        navegador.findElement(By.id("btn_pesquisar")).click();

    }

}