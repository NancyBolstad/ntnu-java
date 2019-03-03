public class Barn{
    private final String navn;
    private char bokstaven;
    private int antall;
    
    public Barn(String navn){
        this.navn=navn;
        bokstaven='\u0000';
        antall=0;  
    }
    
    public char getBokstaven(){
        return this.bokstaven;
    }
    
    public void setBokstaven(char bokstaven){
        this.bokstaven=bokstaven;
    }
    
    public int getAntall(){
        return this.antall;
    }
    
    public void trekk(Kortstokk kortstokk){
        setBokstaven(kortstokk.finnKort());
    }
    
    public boolean vilBeggeBytte(Barn annetBarn){
        if(this.bokstaven>'M'&& annetBarn.bokstaven>'M'){
            return true;
        }else{
            return false;
        }   
    }
    
    public void bytt(Barn annetBarn){
        char temp='\u0000';
        temp=this.bokstaven;
        this.bokstaven=annetBarn.bokstaven;
        annetBarn.bokstaven=temp;
    }
    
    public int sammenlign(Barn annetBarn){
        if(this.bokstaven<annetBarn.bokstaven){
            return this.antall+=1;
        }else{
            return this.antall;
        }
    }  
}