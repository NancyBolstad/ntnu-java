
/**
 * Write a description of class Passordhjelper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Passordhjelper
{
    private static String passordet;
    
    public Passordhjelper(String forslag){
        this.passordet=fjernUlovligeTegn(forslag);
    }
    
    private String fjernUlovligeTegn(String tekst){
       /*String forslag=tekst.replaceAll("\\s+","");
       forslag=forslag.replaceAll("[åÅ]","");
       forslag=forslag.replaceAll("[æÆ]","");
       forslag=forslag.replaceAll("[øØ]","");
       */
      
      /*String forslag;
      StringBuilder buildForslag=new StringBuilder(tekst);
      for(int i=0; i<tekst.length();i++){
          char x=tekst.charAt(i);
          if(!Passordtegn.erPassordtegn(x)){
 
              buildForslag.deleteCharAt(i);
              tekst=buildForslag.toString();
            }
        }
       return forslag=tekst.replaceAll("\\s+","");
       */
      for(int i=0; i<tekst.length();i++){
          char x=tekst.charAt(i);
          while(!Passordtegn.erPassordtegn(x)){
              String first=tekst.substring(0,i);//Copy the substring from the start of the string to the character that has to be deleted.
              String second=tekst.substring(i+1);//Copy the substring from the character that has to be deleted to the end of the String.
              tekst=first+second;//Strings are immutable! Append the second String to the first one.
              x=tekst.charAt(i);
    }
}
return tekst;
}

//https://stackoverflow.com/questions/20304671/delete-char-at-position-in-string/20304712
    
    public int finnPassordstyrken(String passordet){
        int styrken=0;
        int len=0;
        int storBokstav=0;
        int litenBokstav=0;
        int siff=0;
        int spesialtegn=0;
        
        if (passordet.length() >= 8) {
            len=1;
            for (int i = 0; i < passordet.length(); i++) {
                char x = passordet.charAt(i);
                if(Passordtegn.erStorBokstav(x)){
                    storBokstav+=1;
                }
                if(Passordtegn.erLitenBokstav(x)){
                    litenBokstav+=1;
                }
                if(Passordtegn.erSiffer(x)){
                    siff+=1;
                }
                if(Passordtegn.erSpesialtegn(x)){
                    spesialtegn+=1;
                }
            }
        }else{
        System.out.println("Passordet er ikke lovlig.");
    }

    if(len>=1){
        styrken+=1;
    }
    
    if (storBokstav>=1){
        styrken+=1;
    }
    
    if (litenBokstav>=1){
        styrken+=1;
    }
    
    if (siff>=1){
        styrken+=1;
    }
    
    if (spesialtegn>=1){
        styrken+=1;
    }
    
    return styrken;
}
    
    public String getPassord(){
        return passordet;
    }
    
    public String toString(){
        return "Passordet: " + getPassord() + "\nPassordstyrken: " + finnPassordstyrken(this.passordet);
    }
    

}