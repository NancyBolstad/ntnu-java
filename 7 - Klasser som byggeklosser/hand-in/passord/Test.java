class Test{
        public static void main(String[] args){
            Passordhjelper passord1=new Passordhjelper("Mumle  @   æææGåseggåååååååå!");
            int styrken=passord1.finnPassordstyrken(passord1.getPassord());
            System.out.println(passord1.getPassord());
            System.out.println(styrken);
        
        
    }
}