
/**
 * Write a description of class Bil4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bil4
{
    private String regnr;
    private String merke;
    private int årsmodell;
    private int hastighet;
    private boolean motorenIGang;
    
    public Bil4(String regnr, String merke, int årsmodell, int hastighet, boolean motorenIgang){
        this.regnr=regnr;
        this.merke=merke;
        this.årsmodell=årsmodell;
        this.hastighet=0;
        this.motorenIGang=false;
    }
    
    public String getRegnr(){
        return this.regnr;
    }
    
    public String getMerke(){
        return this.merke; 
    }
    
    public int getÅrsmodell(){
        return this.årsmodell;
    }
    
    public int getHastighet(){
        return this.hastighet; 
    }
    
    public boolean isMotorenIGang(){
        return this.motorenIGang;
    }
    
    public void start(){
        this.hastighet=0;
        this.motorenIGang=true;
        
    }
    
    public void økFarten(int økning){
        this.hastighet=this.hastighet+økning;
    }
    
    public void brems(int minskning){
        this.hastighet=this.hastighet-minskning;
    }
    
    public void stopp(){
        this.hastighet=0;
        this.motorenIGang=false;
    }
}
