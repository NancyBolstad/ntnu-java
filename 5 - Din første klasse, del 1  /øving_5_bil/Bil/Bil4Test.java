
/**
 * NTNU_Øving 5: Din første klasse, del 1. 
 *
 * @author Nancy Bolstad
 * @version 18-09-2018
 */
public class Bil4Test
{
    public static void main (String[] args){
            
            Bil4 minbil=new Bil4("Vd-12345", "Volvo", 2002,0, true);
            Bil4 dinbil=new Bil4("BF-935566", "Fiat", 1990,0, false);
            
            System.out.println("Info Minbil: regnr " + minbil.getRegnr() + ", merke " + minbil.getMerke() + ", årsmodell " + minbil.getÅrsmodell() + ", hastighet " + minbil.getHastighet() +", motorenIGang "+ minbil.isMotorenIGang());
            System.out.println("Info Dinbil: regnr " + dinbil.getRegnr() + ", merke " + dinbil.getMerke() + ", årsmodell " + dinbil.getÅrsmodell() + ", hastighet " + dinbil.getHastighet() +", motorenIGang "+ dinbil.isMotorenIGang());
            
            minbil.start();
            dinbil.start();
            
            System.out.println("Test Minbils hastighet før oppstart: " + minbil.getHastighet());
            System.out.println("Test Dinbils hastighet før oppstart: " + minbil.getHastighet());
           
            minbil.økFarten(70);
            dinbil.økFarten(110);
            
            System.out.println("Øk Minbils hastighet med 70 km/t, og vis hastighet: " + minbil.getHastighet());
            System.out.println("Øk Dinbils hastighet med 110 km/t, og vis hastighet: " + dinbil.getHastighet());
            
            
            minbil.brems(50);
            dinbil.stopp();
            
            System.out.println("Minsk Minbils hastighet med 50 km/t, og vis hastighet: " + minbil.getHastighet());
            System.out.println("Stopp Dinbil, og vis hastighet: " + dinbil.getHastighet());

            /* De følgene linjene tester en rar funksjonalitet.*/
          
            minbil.start();
            dinbil.brems(222);
            
            System.out.println("Minbir er rar: regnr " + minbil.getRegnr() + ", merke " + minbil.getMerke() + ", årsmodell " + minbil.getÅrsmodell() + ", hastighet " + minbil.getHastighet() +", motorenIGang "+ minbil.isMotorenIGang());
            System.out.println("Dinbil er rar:regnr " + dinbil.getRegnr() + ", merke " + dinbil.getMerke() + ", årsmodell " + dinbil.getÅrsmodell() + ", hastighet " + dinbil.getHastighet() +", motorenIGang "+ dinbil.isMotorenIGang());

}
}
