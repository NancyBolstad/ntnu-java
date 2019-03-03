/**
 * Et program som regner om fra fahrenheit til celsius. Tar imot antall fahrenheit fra brukeren.
 * Hvis brukeren skriver inn en ugyldig datatype (f.eks bokstaver), returneres en feil melding.
 * Dette gjøres ved hjelp av en validering.
 *
 * @ Nancy Y. Bolstad
 * @ verion 2.0
 * @ Date 06-09-2018
 */

 


import static javax.swing.JOptionPane.*;
import java.util.regex.*;

public class FahrenheitTilCelsius {

    public static void main(String[] args) {

        String fahrenheitLest=showInputDialog("Fehrenheit (grader):");
        Pattern p = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
        Matcher m = p.matcher(fahrenheitLest);

        if (!fahrenheitLest.equals("")&& m.find() ) {
            double fahrenheit = Double.parseDouble(fahrenheitLest);
            double celsius = (fahrenheit - 32) * 5 / 9;
            String utskrift = fahrenheit + " fahrenheit er lik " + celsius + " grader celsius";
            showMessageDialog(null, utskrift);
        } else { // Hvis mønsteret ikke blir funnet, vis følgende melding
                showMessageDialog(null, "Kun numeriske verdier er tillatt!");
                System.exit(1);
            }
        }

}

/* Eksempeldata:

Kjøring 1:
fahrenheitLest: "-98.00"
98.0 fahrenheit er lik -72.22222222222223 grader celsius;

Kjøring 2:
fahrenheitLest:"dhsjkshj"
Kun numeriske verdier er tillatt!
 */
