import static javax.swing.JOptionPane.*;
public class AarTest
{
    public static void main(String[] args){
        String årstallLest=showInputDialog("Årstall?");
        int årstall=Integer.parseInt(årstallLest);
        Aar år=new Aar(årstall);

        String tekst="Året er " + år.getÅr()+"\nI fjor var det " + år.beregnIFjor()+"\nNeste år blir det " + år.beregnNesteÅr()+"\nFor tre år siden var det " + år.beregnOmNoenÅr(-3)+"\nOm tre år blir det " +år.beregnOmNoenÅr(3);
        
        if(år.isSkuddår()){
            tekst+="\n" + årstall+" er skuddår";
        }else{
            tekst+="\n" + årstall+" er ikke skuddår";
        }
        
        showMessageDialog(null,tekst);
        

    }
}
