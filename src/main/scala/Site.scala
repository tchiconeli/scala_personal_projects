trait Site extends FirefoxCon {

  protected val site_base:String
  
  def busca(termo: String): Unit

}
