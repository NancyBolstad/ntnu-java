
/**
 * Write a description of class Bil3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bil3{
    private String regnr;
    private String merke;
    private int årsmodell;
    private int hastighet;
    private boolean motorenIGang;
    
    public Bil3(String regnr, String merke, int årsmodell, int hastighet, boolean motorenIgang){
        this.regnr=regnr;
        this.merke=merke;
        this.årsmodell=årsmodell;
        this.hastighet=0;
        this.motorenIGang=false;
    }
    
    public void setHastighet(int hastighet){
        this.hastighet=hastighet;
    }
    
    public String getRegnr(){
        return this.regnr=regnr;
    }
    
    public String getMerke(){
        return merke; 
    }
    
    public int getÅrsmodell(){
        return årsmodell;
    }
    
    public int getHastighet(){
        return hastighet; 
    }
    
    public boolean isMotorenIGang(){
        return motorenIGang;
    }
}
