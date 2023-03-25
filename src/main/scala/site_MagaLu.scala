import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.{By, Keys, WebDriver, WebElement}

class site_MagaLu extends Site {

  override val site_base = "https://www.magazineluiza.com.br"

  override def busca(termo:String): Unit ={
    val busca_url = "/busca/"
    val busca_prep = termo.replace(" ","%2B")
    driver.get(s"${site_base+busca_url+busca_prep}/")

    aplicarOrdernacao()
//    aplicarFiltro()



    driver.quit()
  }

  def aplicarOrdernacao (): Unit ={
    driver.findElement(By.xpath("//div[@class='sc-hKwDye hBjQcp sc-ZOtfp kwQfrT']")).click() // clica na lista para ordernar os produtos
    driver.findElement(By.xpath("//div[@class='sc-hKwDye hBjQcp sc-ZOtfp kwQfrT']/select[@id='select-desktop-with-label']/option[@value='Menor Preço']")).click() // clica na opção da lista "Menor Preço"

  }

  def aplicarFiltro(): Unit ={
    ///p[@class='sc-kDTinF hDgfVt sc-fFeiMQ etkQEf']
//    driver.findElement(By.xpath("//div[@class='sc-jrQzAO imAcDp sc-fotOHu hUcsrn sc-ieecCq hEnArb sc-ieecCq hEnArb']/p(contains('Placa de Video'))") ).click()
    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[3]/div[1]/div[1]/div[2]/ul/li(contains(@text,'EVGA'))")).click()
  }



}
