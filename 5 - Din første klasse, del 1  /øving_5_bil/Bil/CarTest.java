public class CarTest
{
    public static void main (String[] args){
            
            Car myCar=new Car("Vd-12345", "Volvo", 2002,0, true);
            Car yourCar=new Car("BF-935566", "Fiat", 1990,0, false);
            
            System.out.println("Info My Car: Register Number: " + myCar.getregisterNo() + ", brand " + myCar.getBrand() + ", Model Year " + myCar.getYearModel() + ".");
            System.out.println("Info Your Car: Registered Number: " + yourCar.getregisterNo() + ", brand " + myCar.getBrand() + ", Model Year " + yourCar.getYearModel() + ".");
            
            myCar.startCar();
            yourCar.startCar();
            
            System.out.println("Test my car's speed when started: " + myCar.getSpeed());
            System.out.println("Test my car's speed when started: " + yourCar.getSpeed());
           
            myCar.increaseSpeed(70);
            yourCar.increaseSpeed(110);
            
            System.out.println("Increase my car's speed to 70 km/h, and show speed: " + myCar.getSpeed());
            System.out.println("In crease your car's speed to 110km/h, and show speed: " + yourCar.getSpeed());
}
}
