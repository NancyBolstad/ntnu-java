
/**
 * Write a description of class EnBruker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import static javax.swing.JOptionPane.*;
class EnBruker{
    public static void main (String[]args){
        MatInnhold fritesGate=new MatInnhold("pommes frites, gatekjøken", 1381, 3.00, 39.80);
        MatInnhold fritesFryst=new MatInnhold("pommes frites, fryst", 641, 2.20, 22.00);
        MatInnhold potetKokt=new MatInnhold("potet, kokt", 339, 1.90, 17.10);
    
    String vektLest=showInputDialog("Oppgi mengder(i gram), avslutt med Esc:");
    while (vektLest!=null){
        double vekt=Double.parseDouble(vektLest);
        
        double energi_fritesGate=fritesGate.finnEnergi(vekt);
        double fett_fritesGate=fritesGate.finnFett(vekt);
        double karbo_fritesGate=fritesGate.finnKarbohydrater(vekt);
        double kcal_fritesGate=fritesGate.finnKcal(vekt);
        
        double energi_fritesFryst=fritesFryst.finnEnergi(vekt);
        double fett_fritesFryst=fritesFryst.finnFett(vekt);
        double karbo_fritesFryst=fritesFryst.finnKarbohydrater(vekt);
        double kcal_fritesFryst=fritesFryst.finnKcal(vekt);
        
        double energi_potetKokt=potetKokt.finnEnergi(vekt);
        double fett_potetKokt=potetKokt.finnFett(vekt);
        double karbo_potetKokt=potetKokt.finnKarbohydrater(vekt);
        double kcal_potetKokt=potetKokt.finnKcal(vekt);
        
        String fritesGate_printout=fritesGate.getMatNavn()+" innholder\n energi: " + String.format("%.1f",energi_fritesGate) + "\n fett: "+ String.format("%.1f",fett_fritesGate)+ "\n karbohydraters: " + String.format("%.1f",karbo_fritesGate) + "\n kcal:" + String.format("%.1f",kcal_fritesGate);
        String fritesFryst_printout=fritesFryst.getMatNavn()+" innholder\n energi: " + String.format("%.1f",energi_fritesFryst) + "\n fett: "+ String.format("%.1f",fett_fritesFryst)+ "\n karbohydraters: " + String.format("%.1f",karbo_fritesFryst) + "\n kcal:" + String.format("%.1f",kcal_fritesFryst);
        String potetKokt_printout=potetKokt.getMatNavn()+" innholder\n energi: " + String.format("%.1f",energi_potetKokt) + "\n fett: "+ String.format("%.1f",fett_potetKokt)+ "\n karbohydraters: " + String.format("%.1f",karbo_potetKokt) + "\n kcal:" + String.format("%.1f",kcal_potetKokt);
        
        showMessageDialog(null,fritesGate_printout);
        showMessageDialog(null,fritesFryst_printout);
        showMessageDialog(null,potetKokt_printout);
        
        vektLest=showInputDialog("Oppgi mengder, avslutt med Esc:");
        }
    }
}




