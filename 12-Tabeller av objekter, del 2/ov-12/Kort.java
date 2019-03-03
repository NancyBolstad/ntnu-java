public class Kort
{
    private String farge;
    private int valør;
    private static int essValør=14;
    public static final String[] FARGER={"Spar", "Kløver", "Hjerter", "Ruter"};
    public static final int MINVALØR=2;
    public static final int MAXVALØR=14;
    
    public Kort(){
        this.farge=FARGER[0];
        this.valør=MINVALØR;
    }
    
     public Kort(String farge, int valør){
        this.farge=farge;
        setFarge(farge);
        setValør(valør);
    }
    
    public Kort(int farge, int valør){
        setFarge(farge);
        setValør(valør);
    }
    
    public String getFarge() {
        return farge;
    }
    
    public int fargeValue(){
        for (int i=0; i<4; i++){
            if(farge.equalsIgnoreCase(FARGER[i])){
                return i;
        }else{
            return -1;
        }
    }  
    return fargeValue();    
    }

    public void setFarge(String farge) { 
        for(int i=0; i<FARGER.length; i++){
            if (farge.equalsIgnoreCase(FARGER[i])){ 
		this.farge=farge;
            }else{
                this.farge=null;
            }
    }
    }
    
    public void setFarge(int farge){
        if (farge<4 && farge<=0){
            this.farge=FARGER[farge];
        }
    }
    
    public int getValør() {
        return valør;
    }

    public void setValør(int valør) {
        if(valør>=2 && valør<=13||valør==essValør){
            this.valør=valør;
        }else{
            this.valør=0;
        }
    }
    
    public String toString() {
        return getFarge() + getValør();
    }
    
    public int compareTo(Kort annet){
        return getValør()-annet.getValør();
    }
    
    public int compareKort(Kort annet){
        int compareFarger=fargeValue()-annet.fargeValue();
        if(compareFarger==0){
            return compareTo(annet);
        }else{
        return compareFarger;
        }   
    }
    public boolean equals(Kort annet){
        return this.getValør()==annet.getValør()&& this.farge.equalsIgnoreCase(annet.farge);
    }
}
