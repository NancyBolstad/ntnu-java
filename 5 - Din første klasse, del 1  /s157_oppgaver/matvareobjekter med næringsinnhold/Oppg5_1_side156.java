
/**
 *
 * Klientprogram som beregner næringsinnhold for ulike mengder av
 * tre forskjellige matvarer.
 */
import static javax.swing.JOptionPane;

class Oppg5_1_side156 {
 public static void main(String[] args) {
 Matvare pomFritGkj = new Matvare("pommes frites, gatekjk.", 1381, 3.0, 39.8);
 Matvare pomFritFryst = new Matvare("pommes frites, fryst", 641, 2.2, 22.0);
 Matvare koktPotet = new Matvare("kokt potet", 339, 1.9, 17.1);
 String vektLest = showInputDialog("Vekt i gram, avslutt med Esc: ");
 while (vektLest != null ) {
 double vekt = Double.parseDouble(vektLest);
 System.out.print(pomFritGkj.getNavn());
 System.out.printf(": fett: %.1f, karbohydrater: %.1f, kJ: %.0f, kcal: %.0f.\n",
 pomFritGkj.finnFett(vekt), pomFritGkj.finnKarbohydr(vekt),
 pomFritGkj.finnEnergiKJ(vekt), pomFritGkj.finnEnergiKCAL(vekt));
 System.out.print(pomFritFryst.getNavn());
 System.out.printf(": fett: %.1f, karbohydrater: %.1f, kJ: %.0f, kcal: %.0f.\n",
 pomFritFryst.finnFett(vekt), pomFritFryst.finnKarbohydr(vekt),
 pomFritFryst.finnEnergiKJ(vekt), pomFritFryst.finnEnergiKCAL(vekt));
 System.out.print(koktPotet.getNavn());
 System.out.printf(": fett: %.1f, karbohydrater: %.1f, kJ: %.0f, kcal: %.0f.\n",
 koktPotet.finnFett(vekt), koktPotet.finnKarbohydr(vekt),
 koktPotet.finnEnergiKJ(vekt), koktPotet.finnEnergiKCAL(vekt));
 vektLest = showInputDialog("Vekt i gram, avslutt med Esc: ");
 }
 }
}