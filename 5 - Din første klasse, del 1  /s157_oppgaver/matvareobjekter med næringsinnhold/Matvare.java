
/**
 *
 * Klassen Matvare.
 *
 * Et objekt av klassen Matvare vil inneholde informasjon om
 * næringsinnholdet i en matvare. Klassen kan brukes til å beregne
 * dette for et bestemt antall gram av varen.
 */

class Matvare {
 private final String navn;
 private final int energi;
  private final double fett;
 private final double karbohydr;
 /**
 * Konstruktøren tar data for 100 gram av varen.
 */
 public Matvare(String navn, int energi, double fett, double karbohydr) {
 this.navn = navn;
 this.energi = energi;
 this.fett = fett;
 this.karbohydr = karbohydr;
 }
 public String getNavn() {
 return navn;
 }
 public double finnFett(double gram) {
 return fett * gram * 0.01;
 }
 public double finnKarbohydr(double gram) {
 return karbohydr * gram * 0.01;
 }
 public double finnEnergiKJ(double gram) {
 return energi * gram * 0.01;
 }
 public double finnEnergiKCAL(double gram) {
 return energi * gram * 0.01 * 4.18;
 }
}