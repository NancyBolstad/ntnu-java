public class Car
{
   private String registerNo;
   private String brand;
   private int yearModel;
   private int speed;
   private boolean isMotorStarted;
    
    public Car(String registerNo, String brand, int yearModel, int speed, boolean isMotorStarted){
        this.registerNo=registerNo;
        this.brand=brand;
        this.yearModel=yearModel;
        this.speed=0;
        this.isMotorStarted=false;
    }
    
    public String getregisterNo(){
        return this.registerNo;
    }
    
    public String getBrand(){
        return this.brand; 
    }
    
    public int getYearModel(){
        return this.yearModel;
    }
    
    public int getSpeed(){
        return this.speed; 
    }
    
    public boolean getIsMotorStarted(){
        return this.isMotorStarted;
    }
    
    public void startCar(){
        this.speed=0;
        this.isMotorStarted=true;  
    }
    
    public void increaseSpeed(int speedIncreaced){
        this.speed+=speedIncreaced;
    }
    
    public void decreaseSpeed(int speedDecreased){
        this.speed-=speedDecreased;
    }
    
    public void stopCar(){
        this.speed=0;
        this.isMotorStarted=false;
    }  
}