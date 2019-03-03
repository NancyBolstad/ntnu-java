/**
 * Del av l�sningsforslaget til �ving 12
 * (oppgave 2 i eksamen i LO171D v�ren 2012)
 */

/**
  * Kortspilltest (ekstra)
  *
  */
class Kortspilltest {
  public static void main(String[] args) {
    Egenskapssett egenskapssettet = new Egenskapssett(3, 4);
    System.out.println("Informasjon om egenskapssettet:");
    System.out.println("Minste val�r: " + egenskapssettet.getMinVal�r());
    System.out.println("St�rste val�r: " + egenskapssettet.getMaxVal�r());
    System.out.println("Antall val�rer: " + egenskapssettet.finnAntallVal�rer());
    String resultat = "Alle val�rene: ";
    int[] val�rene = egenskapssettet.finnVal�rene();
    for (int i = 0; i < egenskapssettet.finnAntallVal�rer(); i++) {
      resultat += val�rene[i] + " ";
    }
    System.out.println(resultat);

    System.out.println("Antall kort i kortstokk bestemt av egenskapssettet: "
        + egenskapssettet.finnAntallKortIKortstokken()); // kaller en ekstra metode

    Bunke bunken = new Bunke(egenskapssettet);
    System.out.println("En ny bunke med " + bunken.getAntallKort() + " kort:");
    System.out.println(bunken); // f�r her indirekte testet Egenskapssett-metoden finnKortstokken()
    bunken.stokk();
    System.out.println("Bunken etter stokking:");
    System.out.println(bunken);

    System.out.println("\nFjerner tre kort fra toppen av bunken, nemlig:");
    System.out.println(bunken.fjernToppen());
    System.out.println(bunken.fjernToppen());
    System.out.println(bunken.fjernToppen());

    System.out.println("Bunken med " + bunken.getAntallKort() + " kort:");
    System.out.println(bunken);

    System.out.println("Etter � ha snudd bunken:");
    bunken.snu();
    System.out.println(bunken);

    bunken.stokk();
    System.out.println("Bunken etter ny stokking:");
    System.out.println(bunken);
  }
} // Kortspilltest


/* Kj�ring:
Informasjon om egenskapssettet:
Minste val�r: 3
St�rste val�r: 4
Antall val�rer: 2
Alle val�rene: 3 4
Antall kort i kortstokk bestemt av egenskapssettet: 8
En ny bunke med 8 kort:
spar 3 - spar 4 - kl�ver 3 - kl�ver 4 - hjerter 3 - hjerter 4 - ruter 3 - ruter
4 -
Bunken etter stokking:
spar 4 - hjerter 3 - hjerter 4 - kl�ver 3 - ruter 3 - kl�ver 4 - ruter 4 - spar
3 -

Fjerner tre kort fra toppen av bunken, nemlig:
spar 3
ruter 4
kl�ver 4
Bunken med 5 kort:
spar 4 - hjerter 3 - hjerter 4 - kl�ver 3 - ruter 3 -
Etter � ha snudd bunken:
ruter 3 - kl�ver 3 - hjerter 4 - hjerter 3 - spar 4 -
Bunken etter ny stokking:
kl�ver 3 - spar 4 - hjerter 4 - ruter 3 - hjerter 3 -
*/