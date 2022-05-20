public class Monitor implements Transportierbar {
  private String marke;

  public Monitor(String marke) {
    this.marke = marke;
  }    

  public Monitor(){

  }
    
  /*
   * Interface Methoden
   */

  public double getGewicht() {
    return 5.3;
  }
  
  public boolean isZerbrechlich(){
    return true;
  }

  /*
   * andere Methoden
   */

  public String getMarke(){
    return marke;
  }
}