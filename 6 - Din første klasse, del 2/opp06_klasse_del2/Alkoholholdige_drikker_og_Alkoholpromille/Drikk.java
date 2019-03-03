
/**
 * NTNU Våren 2002 Oppgave 3: Alkoholholdige drikker og alkoholpromille.
 * 
 * God måte å øve på bruk av JAVA GUI og hvordan opprete en klasse
 * 
 * Følgenede JOptionPane-metode brukes:
 * 
 * showConfirmDialog()for å spørre om brukeren er mann. 
 * showOptionDialog()til å lage en meny i klientprogrammet;
 *
 * @Nancy Bolstad
 * @version 19-09-2018
 */
public class Drikk
{
   private String navn;
   private double alkoholProsent;
   public Drikk(){
        
    }
   
    public Drikk(String navn, double alkoholProsent){
        this.navn=navn;
        this.alkoholProsent=alkoholProsent;
    }
    
    public void setAlkoholProsent(double alkoholProsent){
        this.alkoholProsent=alkoholProsent;
    }
    
    public String getNavn(){
        return this.navn;
    }
    
    public double getAlkoholProsent(){
        return this.alkoholProsent;
    }
    
    public double alkoholInnholdIGram(int mlDrikk){
        return (this.alkoholProsent/100)*0.79*mlDrikk;
    }
    
    public double getAlkoholkonsentrasjonIBlod(int mlDrikk, double kroppsvekt, boolean mann){
        
        if(mann==true){
        return ((this.alkoholProsent/100)*0.79*mlDrikk)/(kroppsvekt*0.68);
    } else{
        return ((this.alkoholProsent/100)*0.79*mlDrikk)/(kroppsvekt*0.55);
    }
}
}
