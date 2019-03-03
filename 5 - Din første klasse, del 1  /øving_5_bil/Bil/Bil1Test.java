
/**
 * To Bill-objekter har sitt sett av objektvariabler. Vi har brukt public objektvariabler i Bil og kan da få direkte tak i disse utenfra (vha ".")
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bil1Test
{
        public static void main (String[] args){
            Bil1 minbil=new Bil1();
            Bil1 dinbil=new Bil1();
            
            System.out.println("regnr " + minbil.regnr + ", merke " + minbil.merke + ", årsmodell " + minbil.årsmodell + ", hastighet" + minbil.hastighet +", motorenIGang "+ minbil.motorenIGang);
            System.out.println("regnr " + dinbil.regnr + ", merke " + dinbil.merke + ", årsmodell " + dinbil.årsmodell + ", hastighet" + dinbil.hastighet +", motorenIGang "+ dinbil.motorenIGang);
            
            minbil.hastighet=111;
            dinbil.hastighet=222;
            
            System.out.println("regnr " + minbil.regnr + ", merke " + minbil.merke + ", årsmodell " + minbil.årsmodell + ", hastighet" + minbil.hastighet +", motorenIGang "+ minbil.motorenIGang);
            System.out.println("regnr " + dinbil.regnr + ", merke " + dinbil.merke + ", årsmodell " + dinbil.årsmodell + ", hastighet" + dinbil.hastighet +", motorenIGang "+ dinbil.motorenIGang);
            
}
}