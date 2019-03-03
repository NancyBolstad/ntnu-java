/**
 * Del av løsningsforslaget til øving 12
 * (oppgave 2 i eksamen i LO171D våren 2012)
 */

/**
  * Kort. Immutabel klasse.
  *
  */
class Kort implements Comparable<Kort> {
  private final String farge;
  private final int valør;

  public Kort(String farge, int valør) {
    this.farge = farge;
    this.valør = valør;
  }

  public String getFargen() {
    return farge;
  }

  public int getValøren() {
    return valør;
  }

  public boolean equals(Object objekt) {
    if (!(objekt instanceof Kort)) return false;
    if (this == objekt) {
      return true;
    }
    Kort annetKort = (Kort) objekt;
    return valør == annetKort.valør;
  }

  public int compareTo(Kort detAndre) {
    return valør - detAndre.valør;
  }

  /* ekstra */
  public String toString() {
    return "(" + farge + " " + valør + ")";
  }
} // Kort
