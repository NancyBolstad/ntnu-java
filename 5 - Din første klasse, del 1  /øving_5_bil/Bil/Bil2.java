
/**
 * Write a description of class Bil2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bil2
{
    // instance variables - replace the example below with your own
    private String regnr;
    private String merke;
    private int årsmodell;
    private int hastighet;
    private boolean motorenIGang;
    
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



