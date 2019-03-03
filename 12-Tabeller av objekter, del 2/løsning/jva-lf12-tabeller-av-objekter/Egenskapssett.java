/**
 * Del av løsningsforslaget til øving 12
 * (oppgave 2 i eksamen i LO171D våren 2012)
 */

/**
  * Egensskapssett. Immutabel klasse.
  *
  */
class Egenskapssett {
  public static final String[] FARGENE
      = {"spar", "kløver", "hjerter", "ruter"}; // klassekonstant
  public final int minValør;
  public final int maxValør;

  public Egenskapssett(int minValør, int maxValør) {
    this.minValør = minValør;
    this.maxValør = maxValør;
  }

  public int getMinValør() {
    return minValør;
  }

  public int getMaxValør() {
    return maxValør;
  }

  public int finnAntallValører() {
    return maxValør - minValør + 1;
  }

  public int[] finnValørene() {
    int[] valørene = new int[finnAntallValører()];
    for (int i = 0; i < finnAntallValører(); i++) {
      valørene[i] = minValør + i;
    }
    return valørene;
  }

  public int finnAntallKortIKortstokken() {
    return FARGENE.length * finnAntallValører();
  }

  public Kort[] finnKortstokken() {
    int antallValører = finnAntallValører();
    int antallKort = finnAntallKortIKortstokken();
    Kort[] kortene = new Kort[antallKort];
    int teller = 0;
    for (int i = 0; i < FARGENE.length; i++) {
      for (int j = getMinValør(); j <= getMaxValør(); j++) {
        kortene[teller] = new Kort(FARGENE[i], j);
        teller++;
      }
    }
    return kortene;
  }
} // Egenskapssett