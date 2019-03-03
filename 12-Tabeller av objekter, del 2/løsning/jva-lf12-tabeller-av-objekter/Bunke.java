/**
 * Del av l�sningsforslaget til �ving 12
 * (oppgave 2 i eksamen i LO171D v�ren 2012)
 */

import java.util.Random;

/**
  * Bunke. Mutabel klasse.
  *
  */
class Bunke {
  private Egenskapssett egenskapssettet;
    /* Kortene ligger fortl�pende f.o.m. indeks 0 (bunnen)
     * t.o.m. indeks antallKort - 1 (toppen): */
  private Kort[] kortene;
  private int antallKort;

  /* bunken er hele kortstokken */
  public Bunke(Egenskapssett egenskapssettet) {
    this.egenskapssettet = egenskapssettet;
    kortene = egenskapssettet.finnKortstokken();
    antallKort = egenskapssettet.finnAntallKortIKortstokken();
  }

  public int getAntallKort() {
    return antallKort;
  }

  public Kort fjernToppen() {
    if (antallKort > 0) {
      Kort returkort = kortene[antallKort - 1];
      kortene[antallKort - 1] = null; // fjerner kortet
      antallKort--;
      return returkort;
    } else return null;
  }

  public void snu() {
    for (int i = 0; i < antallKort / 2; i++) {
      Kort hjelp = kortene[i];
      kortene[i] = kortene[antallKort - i - 1];
      kortene[antallKort - i - 1] = hjelp;
    }
    /* Alternativt kunne vi ha kopiert over til
     * en ny tabell i omvendt rekkef�lge;
     * og s� satt kortene til � peke til den nye.
     */
  }

  /*
   * Vi trekker ett og ett pseudotilfeldig kort fra kortene
   * og flytter det til til-tabellen.
   */
  public void stokk() {
    Kort[] til = new Kort[kortene.length];
    Random randomGen = new Random();
      for (int skalF�N� = 0; skalF�N� < antallKort; skalF�N�++) {
        int antallIgjen = antallKort - skalF�N�;
        /* antallIgjen vil l�pe fra antallKort til 1.
         *
         * kortene-tabell inneholder antallIgjen kort f.o.m. indeks 0
         * og fortl�pende utover til antallIgjen - 1.
         * For skalF�N� > 0: til-tabell inneholder skalF�N� kort
         * f.o.m. indeks 0 og fortl�pende utover til skalF�N� - 1.
         */
        int trukket = randomGen.nextInt(antallIgjen);
        /* trukket er n� i intervallet [0, antallIgjen - 1] */
        til[skalF�N�] = kortene[trukket]; // legger trukket kort i til-tabellen
        /* flytter siste kort i kortene-tabellen til trukkets plass: */
        kortene[trukket] = kortene[antallIgjen - 1];
        kortene[antallIgjen - 1] = null; // egentlig ikke n�dvendig
      }
    kortene = til;
  }

  /*
   * Alternativ l�sning: Vi flytter kortene, ett av gangen, over til
   * pseudotilfeldige plasser i en ny tabell kalt til.
   */
  public void stokk2() {
    Kort[] til = new Kort[kortene.length];
    Random randomGen = new Random();
    /*
     * I runde i skal vi flytte kortene[i] til en pseudotilfeldig
     * ledig plass i til-tabellen
     */
    for (int i = 0; i < antallKort; i++) {
      int trukketPos = randomGen.nextInt(antallKort);
      /* trukketPos er n� i [0, antallKort - 1] */
      while (til[trukketPos] != null) { // plassen er allerede opptatt
        trukketPos = randomGen.nextInt(antallKort);
      }
      til[trukketPos] = kortene[i];
    }
    kortene = til;
  }

  /* ekstra */
  public String toString() {
    String resultat = "";
    for (int i = 0; i < antallKort; i++) {
      resultat += kortene[i] + " ";
    }
    return resultat;
  }
} // Bunke