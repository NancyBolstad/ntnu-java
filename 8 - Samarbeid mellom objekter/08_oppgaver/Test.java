public class Test
{
    public static void main(String[] args){
        Spill spill1=new Spill();
        int spilleOmgang=3;
        for(int i=0; i<3;i++){
            System.out.println("This is round: " + (i+1));
            System.out.println(spill1.spill());
            
        }
}
}
