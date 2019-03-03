
/**
 * Et program regner om temperatur konversjon fra fahrenheit til grader celsius. 
 *
 * @Nancy Y. Bolstad
 * @verion 1.0
 * @Date 19-08-2018
 */
public class TemperatureConversion
{
 public static void main(String[] args) {
    double fahrenheit = 98;
    double celsius=(fahrenheit - 32) * 5 / 9;
    System.out.println(fahrenheit + " fahrenheit er lik " + celsius + " grader celsius");
  }
}      
        
