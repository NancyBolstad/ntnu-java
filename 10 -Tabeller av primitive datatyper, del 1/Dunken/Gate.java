public class Gate
{
   private final String streetName;
   private int[] weight;
    
    public Gate(String streetName, int largestStreetNo){
        this.streetName=streetName;
        int largestBinNo=largestStreetNo;
        this.weight=new int[largestBinNo];
        for (int i=0;i<largestBinNo;i++){
            this.weight[i]=0;
    }
    }
    public Gate(int[] startValues){
        this.streetName="";
        this.weight=new int[startValues.length];
       for(int i=0;i<startValues.length;i++){
           this.weight[i]=startValues[i];
    }
    }
    public int[] getWeightArray(){
        int[] getWeightArray=new int[weight.length];
        for(int i=0;i<weight.length;i++){
            getWeightArray[i]=weight[i];
        }
    return getWeightArray;
    }
    public String getStreetName(){
    return streetName;
    }
    public int getWeightInEachBin(int nr){
        return weight[nr];
    }
    public void cast(int nr, int vekt){
       weight[nr]=getWeightInEachBin(nr)-vekt;
    }
    public boolean isFull(int nr){
        return getWeightInEachBin(nr)>=1000;    
    }
    public void emptyBin(int nr){
        weight[nr]=0;
    }
    private int findFirstNoOnEachSide(boolean isEvenSide){
       return isEvenSide? 2:1;
    }
    private boolean isOnEvenSide(boolean isEvenSide){
       return findFirstNoOnEachSide(isEvenSide)==2? true:false;
    }
    public void empty(boolean isEvenSide){
        if(isOnEvenSide(isEvenSide)){
           for (int i=2; i<weight.length;i+=2){
               emptyBin(i);
            }
        }else if(!isOnEvenSide(isEvenSide)){
            for (int i=1; i<weight.length;i+=2){
                emptyBin(i);
        }
    }
    }
    public boolean findTwoFullBinsNearby(boolean isEvenSide){
        boolean result=false;
        if(isOnEvenSide(isEvenSide)){
            for (int i=2; i<weight.length;i+=2){
               if((isFull(i)==isFull(i+2))||(isFull(i)==isFull(i-2))){
                  result=true; 
            }
        }
    }else if(!isOnEvenSide(isEvenSide)){
                for (int i=1; i<weight.length;i+=2){
            if((isFull(i)==isFull(i+2))||(isFull(i)==isFull(i-2))){
                 result=true; 
            }
        }
    } else{
        result=false;
        }
    return result;
    }
    public String toString(){
     String displayWeightArray="";
     for (int i=0;i<weight.length;i++){
         displayWeightArray+=weight[i]+"";
    }
    return displayWeightArray;
    }
}