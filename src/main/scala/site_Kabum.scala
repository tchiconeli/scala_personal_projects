

class site_Kabum  extends Site {

  override val site_base = "http://www.kabum.com.br"

  override def busca(termo:String): Unit ={
    val busca_url = "/busca/"
    val busca_prep = termo.replace(" ","-")
    driver.get(s"${site_base+busca_url+busca_prep}?page_number=1&page_size=500&facet_filters=&sort=price")


    driver.quit()
  }


}
