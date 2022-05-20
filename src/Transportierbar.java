public interface Transportierbar {
  double MAX_GEWICHT=234;

  double getGewicht();
  boolean isZerbrechlich();

  static boolean gueltigesGewicht(Transportierbar t){
    return t.getGewicht()>0 && t.getGewicht()<MAX_GEWICHT;
  }

  default String getBeschreibung(){
    return this.getGewicht()+" kg, zerbrechlich: "+this.isZerbrechlich(); 
  }

}