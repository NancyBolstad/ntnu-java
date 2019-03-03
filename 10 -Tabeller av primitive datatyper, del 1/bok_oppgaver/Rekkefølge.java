
/**
 * Oppgaver 2, sider 215
 * 
 * Lag en tabell av datatypen char. Den skal initieres med verdiene A N N E.
 * Sett opp programkode som skriver ut disse verdiene i motsatt rekkefølge.
 *
 * @author (Nancy Bolstad)
 * @version (22-10-2018)
 */
public class Rekkefølge
{
    public static final char[] WORD={'A', 'N', 'N', 'E'};  
   public static void main (String[] args){
   int num=WORD.length;
   while(num>0){
       System.out.println(WORD[num-1]);
       num-=1;
    }
}
}