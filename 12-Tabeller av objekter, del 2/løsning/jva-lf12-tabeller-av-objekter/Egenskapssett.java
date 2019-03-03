/**
 * Del av l�sningsforslaget til �ving 12
 * (oppgave 2 i eksamen i LO171D v�ren 2012)
 */

/**
  * Egensskapssett. Immutabel klasse.
  *
  */
class Egenskapssett {
  public static final String[] FARGENE
      = {"spar", "kl�ver", "hjerter", "ruter"}; // klassekonstant
  public final int minVal�r;
  public final int maxVal�r;

  public Egenskapssett(int minVal�r, int maxVal�r) {
    this.minVal�r = minVal�r;
    this.maxVal�r = maxVal�r;
  }

  public int getMinVal�r() {
    return minVal�r;
  }

  public int getMaxVal�r() {
    return maxVal�r;
  }

  public int finnAntallVal�rer() {
    return maxVal�r - minVal�r + 1;
  }

  public int[] finnVal�rene() {
    int[] val�rene = new int[finnAntallVal�rer()];
    for (int i = 0; i < finnAntallVal�rer(); i++) {
      val�rene[i] = minVal�r + i;
    }
    return val�rene;
  }

  public int finnAntallKortIKortstokken() {
    return FARGENE.length * finnAntallVal�rer();
  }

  public Kort[] finnKortstokken() {
    int antallVal�rer = finnAntallVal�rer();
    int antallKort = finnAntallKortIKortstokken();
    Kort[] kortene = new Kort[antallKort];
    int teller = 0;
    for (int i = 0; i < FARGENE.length; i++) {
      for (int j = getMinVal�r(); j <= getMaxVal�r(); j++) {
        kortene[teller] = new Kort(FARGENE[i], j);
        teller++;
      }
    }
    return kortene;
  }
} // Egenskapssett