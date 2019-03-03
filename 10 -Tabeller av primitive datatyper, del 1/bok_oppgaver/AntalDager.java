
/**
 * Oppgaver sider 215. 
 * 
 * 1) Lag en tabell som skal ha plass til å lagre antall dager i hver måned. 
 * Gi verdier til tabellelementene ved initiering. 
 * Antall dager i februar settes lik 28.
 * 
 * 2)Skrive en kodebit som spør brukeren om det er skuddår. 
 * Hvis det er det, skal antall dager i februar settes lik 29.
 *
 * @author (Nancy Y. Bolstad)
 * @version (22-10-2018)
 */

import static javax.swing.JOptionPane.*;
public class AntalDager
{
    public static void main(String[] args){
        int[] antallDager=new int[12];
        for(int j=0; j<antallDager.length;j++){
            if(j%2==0){
                antallDager[j]=31;
            }else{
                antallDager[j]=30;
            }
        }
        
        int option=showConfirmDialog(null,"Er det skuddår?", "Confirm",YES_NO_OPTION,QUESTION_MESSAGE);
        if(option==YES_OPTION){
            antallDager[1]=29;
        }else{
            antallDager[1]=28;
        }
        
        antallDager[7]=31;
        
        int dagerTotall=0;
        for(int i=0;i<antallDager.length;i++){
            dagerTotall+=antallDager[i];
        }
        
        for(int k=0;k<antallDager.length;k++){
        
            System.out.println("Det månded:" + (k+1) + " og der er " + antallDager[k] + "dager i dettee månded." + " Totall: " + dagerTotall);
            
            if(option==YES_OPTION){
                System.out.println("Det er skuddår");
            }
    }
}
}
