
/**
 * NTNU Våren 2002.
 * 
 * Oppgave 3: Alkoholholdige drikker og alkoholpromille. Dette er klientprogramet til Drikk.java.
 *
 * @author NancyBolstad
 * @version 19-09-2018
 */
import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;

public class DrikkTest{
    public static void main(String[] args){
    Drikk user1=new Drikk();
    String vektLest=showInputDialog("Vekt i kilo?");
    int kroppsvekt=Integer.parseInt(vektLest);
    
    boolean mann=true;
    int kjønn=showConfirmDialog(null,"Mann?");
   
    switch(kjønn){
        case 0://Yes_Option
        mann=true;
        break;
        case 1://No_Option
        mann=false;
        break;
        case -1://Closed_Option
        showMessageDialog(null,"Ha det!");
        break;
        case 2://Cancel_Option
        mann=true;
        showMessageDialog(null,"Okay! Vi antar at du er mann.");
        break;
    }
    
    final String[] Muligheter={"vin", "øl", "konjakk","avslutt"};
    final int Vin=0;
    final int Øl=1;
    final int Konjakk=2;
    final int Avslutt=3;
    int valg=showOptionDialog(null,"Velg", "Drikk", DEFAULT_OPTION, PLAIN_MESSAGE, null, Muligheter, Muligheter[0]);
 
    while (valg!=3){
        
        switch(valg){
        case 0:
        user1.setAlkoholProsent(12);
        break;
        case 1:
        user1.setAlkoholProsent(4.7);
        break;
        case 2:
        user1.setAlkoholProsent(43);
        break;
    }
        
        String mlDrikkLest=showInputDialog("Hvor mye vil du drikke?");
        int mlDrikk=Integer.parseInt(mlDrikkLest);
        double result=user1.getAlkoholkonsentrasjonIBlod(mlDrikk,kroppsvekt,mann);
        final DecimalFormat resultFormat=new DecimalFormat("#0.00");
        final double høystAlkoIBlod=0.2;
        if(result<=0.2){
            showMessageDialog(null, "Du kan kjøre bil i Norge. Alkoholkonsentrasjon i blodet er " + resultFormat.format(result)+".");
        }else{
            showMessageDialog(null, "Du kan ikke kjøre bil i Norge. Siden alkoholkonsentrasjon i blodet er " + resultFormat.format(result)+".");
        }
        valg=showOptionDialog(null,"Velg", "Drikk", DEFAULT_OPTION, PLAIN_MESSAGE, null, Muligheter, Muligheter[0]); 
    }
        
    showMessageDialog(null,"Ha det!");    
}
}