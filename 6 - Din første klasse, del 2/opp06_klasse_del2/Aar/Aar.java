
public class Aar
{
  private int årstall;
  
  public Aar(){
      årstall=0;
    }
  
  public Aar(int årstall){
      this.årstall=årstall;
    }
  
  public int getÅr(){ 
      return this.årstall;
    }
 
  public int beregnIFjor(){
      int fjor=-1;
      return this.årstall+(-1);
    }
  
  public int beregnNesteÅr(){
      int nesteÅr=1;
      return this.årstall+1;
    }
  
  public int beregnOmNoenÅr(int noenÅr){
      return this.årstall+noenÅr;
    }
  
  public boolean isSkuddår(){
      boolean isSkuddår;
      
      if ((this.årstall%4==00 && this.årstall%100!=0)|| this.årstall%400==0){
          return isSkuddår=true;
        }else{
            return isSkuddår=false;
        }
    }
}
