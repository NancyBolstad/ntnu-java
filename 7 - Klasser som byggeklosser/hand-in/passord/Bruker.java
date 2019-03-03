
public class Bruker
{
    private String brukernavnet;
    Passordhjelper hjelperen;
    private boolean påLogget;
    
    public Bruker(String brukernavnet, String brukerpassord, boolean påLogget){
        this.brukernavnet=brukernavnet;
        this.hjelperen=new Passordhjelper(brukerpassord);
        this.påLogget=påLogget;   
    }
    
    public void loggInn(String navn, String passord){
        if(navn.equals(this.brukernavnet)|| passord.equals(this.hjelperen.getPassord())){
            this.påLogget=true;
        }else{
            loggUt();
        }
        
    }
    public void loggUt(){
        this.påLogget=false;
    }
    
    public String getLoggetInfo(){
        if(påLogget){
            return "Logget";
        }else{
            return "Ikke logget";
        }
    }
    
    public int finnPassordstyrken(String brukerpassord){
        return hjelperen.finnPassordstyrken(brukerpassord);
    }
    
    public String toString(){
        return "Brukernavnet: "+ this.brukernavnet + "\n"+hjelperen.toString()+ "\nStatus: " + getLoggetInfo();
    }
}
