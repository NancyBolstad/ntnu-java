import java.util.Random;

public class Bunke
{
    private Egenskapssett egenskapssettet;
    private Kort[] kort;
    private int antallKort;
    private int topIndex=antallKort-1;
    private int bunnenIndex=0;
   
    public Bunke(Egenskapssett egenskapssettet){
        this.egenskapssettet=egenskapssettet;
        this.kort=egenskapssettet.finnKortstokken();
        this.antallKort=egenskapssettet.finnAntallKortIKortstokken();
    }
    
    public int getAntallKort(){
        return antallKort;
    }
    
    public Kort fjernToppen(){
        Kort result=null;
        if(kort.length>0){
        result=kort[topIndex];
        kort[topIndex]=null;
        antallKort--;
    }
    return result;
    }
    
    public Kort[] snu(){
        Kort[] snu=new Kort[kort.length];
        for (int i=snu.length; i>=0; i--){
            snu[i]=kort[i];
        }
        return snu;
    }
    
   public Kort[] stokk(){
       Kort[] stokk=new Kort[antallKort];
       for(int i=0; i<kort.length; i++){
           stokk[i]=kort[i];
        }
       Random rgen = new Random();  		
       for (int i=0; i<stokk.length; i++) {
         int randomPosition = rgen.nextInt(stokk.length);
         Kort temp = stokk[i];
         stokk[i] = stokk[randomPosition];
         stokk[randomPosition] = temp;
	}
		return stokk;
}
}
