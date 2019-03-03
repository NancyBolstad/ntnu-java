/**
 * Del av l�sningsforslaget til �ving 12
 * (oppgave 2 i eksamen i LO171D v�ren 2012)
 */

/**
  * Kort. Immutabel klasse.
  *
  */
class Kort implements Comparable<Kort> {
  private final String farge;
  private final int val�r;

  public Kort(String farge, int val�r) {
    this.farge = farge;
    this.val�r = val�r;
  }

  public String getFargen() {
    return farge;
  }

  public int getVal�ren() {
    return val�r;
  }

  public boolean equals(Object objekt) {
    if (!(objekt instanceof Kort)) return false;
    if (this == objekt) {
      return true;
    }
    Kort annetKort = (Kort) objekt;
    return val�r == annetKort.val�r;
  }

  public int compareTo(Kort detAndre) {
    return val�r - detAndre.val�r;
  }

  /* ekstra */
  public String toString() {
    return "(" + farge + " " + val�r + ")";
  }
} // Kort
