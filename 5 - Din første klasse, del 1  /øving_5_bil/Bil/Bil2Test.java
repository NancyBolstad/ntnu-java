
/**
 * Write a description of class Bil2Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bil2Test
{
        public static void main (String[] args){
            Bil2 minbil=new Bil2();
            Bil2 dinbil=new Bil2();
            
            System.out.println("regnr " + minbil.getRegnr() + ", merke " + minbil.getMerke() + ", årsmodell " + minbil.getÅrsmodell() + ", hastighet" + minbil.getHastighet() +", motorenIGang "+ minbil.isMotorenIGang());
            System.out.println("regnr " + dinbil.getRegnr() + ", merke " + dinbil.getMerke() + ", årsmodell " + dinbil.getÅrsmodell() + ", hastighet" + dinbil.getHastighet() +", motorenIGang "+ dinbil.isMotorenIGang());
            
            minbil.setHastighet(111);
            dinbil.setHastighet(222);
            
            System.out.println("regnr " + minbil.getRegnr() + ", merke " + minbil.getMerke() + ", årsmodell " + minbil.getÅrsmodell() + ", hastighet" + minbil.getHastighet() +", motorenIGang "+ minbil.isMotorenIGang());
            System.out.println("regnr " + dinbil.getRegnr() + ", merke " + dinbil.getMerke() + ", årsmodell " + dinbil.getÅrsmodell() + ", hastighet" + dinbil.getHastighet() +", motorenIGang "+ dinbil.isMotorenIGang());
            
}
}
