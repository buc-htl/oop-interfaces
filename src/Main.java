/**
 Beschreibung zu Interfaces: siehe PDF
 **/
class Main {
    public static void main(String[] args) {

        System.out.println(Transportierbar.MAX_GEWICHT);

        Transportierbar[] gegenstaende = new Transportierbar[]{
            new Monitor(), new Buch()};

        verschicken(gegenstaende[0]);

        if (Transportierbar.gueltigesGewicht(gegenstaende[1])) {
            System.out.println("Gültiges Gewicht");
        }

        System.out.println(gegenstaende[1].getBeschreibung());
    }

    public static void verschicken(Transportierbar packet) {
        System.out.println("Packet mit einem Gewicht von "+packet.getGewicht()+" kg verschickt.");
    }
}