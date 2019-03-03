public class Spill{
    private Barn barn1;
    private Barn barn2;
    private Kortstokk stokken;
 
 public Spill(){
     this.barn1=new Barn(getBarn1Navn());
     this.barn2=new Barn(getBarn2Navn());
     this.stokken=new Kortstokk(); 
}

public String getBarn1Navn(){
    String navn1="Siri";
    return navn1;
}

public String getBarn2Navn(){
    String navn2="Iris";
    return navn2;
}

public char getStokk(){
    return stokken.finnKort();
}

public String spill(){
    barn1.trekk(stokken);
    barn2.trekk(stokken);
    char barn1Trekk=barn1.getBokstaven();
    char barn2Trekk=barn2.getBokstaven();
    String byttStatus;
    if(barn1.vilBeggeBytte(barn2)){
        byttStatus="both want to change";
        barn1.bytt(barn2);  
    }else{
        byttStatus="don't make a change";
    }
    String output=getBarn1Navn()+ " drew the letter: " + barn1Trekk + "\n" + getBarn2Navn()+ " drew the letter: " + barn2Trekk + "\nThey " + 
        byttStatus+ "\nResult: "+ getBarn1Navn() + " has " +  barn1.sammenlign(barn2) + " point(s). " + getBarn2Navn() + " has " +  barn2.sammenlign(barn1) + " point(s).";
    
    return output;    
}
}