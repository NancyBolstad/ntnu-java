public class Egenskapssett
{
   private final String[] fargene={"spar", "kløver", "hjerter", "ruter"};
   private final int minValør;
   private final int maxValør;
   
   public Egenskapssett(int minValør,int maxValør){
       if(minValør<=maxValør){
           this.minValør=minValør;
           this.maxValør=maxValør;
       }else{
           this.minValør=maxValør;
           this.maxValør=minValør;
       }
   }
   public int getMinValør(){
       return minValør;
    }
   public int getMaxValør(){
       return maxValør;
   }
   public int finnAntallValører(){
       return (getMaxValør()-getMinValør())+1;
    }
   public int[] finnValørene(){
       int[] finnValørene=new int[finnAntallValører()];
       finnValørene[0]=getMinValør();
       for(int i=1; i<finnValørene.length;i++){
           finnValørene[i]=finnValørene[0]+i;
        }
        return finnValørene;
    }
    public Kort[] finnKortstokken(){
        int[] finnValørene=finnValørene();
        Kort[] kortstokken=new Kort[finnAntallValører()*4];
        int finnFarge=0;
        while(finnFarge<4){
        for(int i=0;i<kortstokken.length;i++){
           kortstokken[i]=new Kort(fargene[finnFarge],finnValørene[i]);
        }
        finnFarge++;
        }
        return kortstokken;
    }
   
    public int finnAntallKortIKortstokken(){
        return finnAntallValører()*4;
    } 
}