class Kortspilltest {
  public static void main(String[] args) {
    Egenskapssett egenskapssettet = new Egenskapssett(3, 4);
    System.out.println("Informasjon om egenskapssettet:");
    System.out.println("Minste valør: " + egenskapssettet.getMinValør());
    System.out.println("Største valør: " + egenskapssettet.getMaxValør());
    System.out.println("Antall valører: " + egenskapssettet.finnAntallValører());
    String resultat = "Alle valørene: ";
    int[] valørene = egenskapssettet.finnValørene();
    for (int i = 0; i < egenskapssettet.finnAntallValører(); i++) {
      resultat += valørene[i] + " ";
    }
    System.out.println(resultat);

    System.out.println("Antall kort i kortstokk bestemt av egenskapssettet: "
        + egenskapssettet.finnAntallKortIKortstokken()); // kaller en ekstra metode

    Bunke bunken = new Bunke(egenskapssettet);
    System.out.println("En ny bunke med " + bunken.getAntallKort() + " kort:");
    System.out.println(bunken);  // får her indirekte testet Egenskapssett-metoden finnKortstokken()
    bunken.stokk();
    System.out.println("Bunken etter stokking:");
    System.out.println(bunken);

    System.out.println("\nFjerner tre kort fra toppen av bunken, nemlig:");
    System.out.println(bunken.fjernToppen());
    System.out.println(bunken.fjernToppen());
    System.out.println(bunken.fjernToppen());

    System.out.println("Bunken med " + bunken.getAntallKort() + " kort:");
    System.out.println(bunken);

    System.out.println("Etter å ha snudd bunken:");
    bunken.snu();
    System.out.println(bunken);

    bunken.stokk();
    System.out.println("Bunken etter ny stokking:");
    System.out.println(bunken);
  }
}