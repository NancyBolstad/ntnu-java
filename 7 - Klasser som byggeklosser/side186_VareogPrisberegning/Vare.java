
/**
 * Prisberegning.java
 * 
 * Filen inneholder to klasser:
 * Vare:Klassen beskriver varer med navn, nummer og pris.
 * Prisberegning: Oppretter to vareobjekter.
 */
import static  javax.swing.JOptionPane.*;
class Vare
{
    public static final double MOMS=24.0;
    public static final double MOMSFAKTOR=1.0+MOMS/100.0;
    
    private final String varenavn;
    private final int varenr;
    private double pris;//pris pr. kilo, alltid uten moms
    
    public static final double RABATT1 = 10.0;
    public static final double RABATTFAKTOR1 = (100.0 - RABATT1) / 100.0;
    public static final double RABATTGRENSE1 = 3.0;
    public static final double RABATT2 = 20.0;
    public static final double RABATTFAKTOR2 = (100.0 - RABATT2) / 100.0;
    public static final double RABATTGRENSE2 = 5.0;
    
    public Vare(String varenavn, int varenr, double pris){
        this.varenavn=varenavn;
        this.varenr=varenr;
        this.pris=pris;
    }
    
    public Vare(String varenavn, int varenr){
        this.varenavn=varenavn;
        this.varenr=varenr;
        this.pris=0.0;
    }
    
    public String getVarenavn(){
        return varenavn;
    }
    
    public int getVarenr(){
        return varenr;
    }
    
    public double getPris(){
        return pris;
    }
    
    public void setPris(double pris){
        this.pris=pris;
    }
    
    
    public double finnPrisUtenMoms(double vekt){
        double beregnetPris=vekt*pris;
        if(vekt>=RABATTGRENSE2){
            beregnetPris*=RABATTFAKTOR2;
        }else if(vekt>=RABATTGRENSE1){
            beregnetPris*=RABATTFAKTOR1;
        }
        return beregnetPris;
    }
    
    public double finnPrisMedMoms(double vekt){
        return finnPrisUtenMoms(vekt)*MOMSFAKTOR;
    }
    
    public String toString(){
        java.util.Formatter f=new java.util.Formatter();
        f.format("%.2f", pris);
        return varenr + ": " + ", pris pr.kg kr " + f.toString()+ "u.moms.";
    }
    
    class Prisberegning{
        public void main(String[] args){
            Vare vare=new Vare("Norgesost", 124);
            String kgPrisLest=showInputDialog("Kilopris, avslutt med Esc:");
            while (kgPrisLest!=null){
                double kgPris=Double.parseDouble(kgPrisLest);
                String antKgLest=showInputDialog("Antall kilo:");
                double antKg=Double.parseDouble(antKgLest);
                vare.setPris(kgPris);
                double prisUMoms=vare.finnPrisUtenMoms(antKg);
                double prisMMoms=vare.finnPrisMedMoms(antKg);
                java.util.Formatter f1=new java.util.Formatter();
                f1.format("%.2f", prisUMoms);
                java.util.Formatter f2=new java.util.Formatter();
                f2.format("%.2f", prisMMoms);
                java.util.Formatter f3=new java.util.Formatter();
                f3.format("%.2f", Vare.MOMS);
                String melding="Uten moms, kr " + f1.toString()+", med moms kr " + f2.toString()+ ", momsen er " + f3.toString()+ " %.";
                showMessageDialog(null, melding);
                kgPrisLest=showInputDialog("Kilopris, avslutt med Esc: ");
                
            }
        }
    }
}
