
/**
 * Write a description of class Bil3Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bil3Test
{
    public static void main (String[] args){
            /*
             * Bil3 minbil=new Bil3(); Bil3 dinbil=new Bil3();
             * Det kan føre til fail meldning, fordi det ikke lenger har standardkonstruktøren i Bil3.java. (se s.168)
             */
            
            Bil3 minbil=new Bil3("Vd-12345", "Volvo", 2002,0, true);
            Bil3 dinbil=new Bil3("BF-935566", "Fiat", 1990,0, false);
            
            System.out.println("regnr " + minbil.getRegnr() + ", merke " + minbil.getMerke() + ", årsmodell " + minbil.getÅrsmodell() + ", hastighet" + minbil.getHastighet() +", motorenIGang "+ minbil.isMotorenIGang());
            System.out.println("regnr " + dinbil.getRegnr() + ", merke " + dinbil.getMerke() + ", årsmodell " + dinbil.getÅrsmodell() + ", hastighet" + dinbil.getHastighet() +", motorenIGang "+ dinbil.isMotorenIGang());
            
            minbil.setHastighet(111);
            dinbil.setHastighet(222);
            
            System.out.println("regnr " + minbil.getRegnr() + ", merke " + minbil.getMerke() + ", årsmodell " + minbil.getÅrsmodell() + ", hastighet" + minbil.getHastighet() +", motorenIGang "+ minbil.isMotorenIGang());
            System.out.println("regnr " + dinbil.getRegnr() + ", merke " + dinbil.getMerke() + ", årsmodell " + dinbil.getÅrsmodell() + ", hastighet" + dinbil.getHastighet() +", motorenIGang "+ dinbil.isMotorenIGang());
            
}
}
