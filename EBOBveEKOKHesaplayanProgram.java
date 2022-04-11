package ebobveekokhesaplayanprogram;
import java.util.*;

public class EBOBveEKOKHesaplayanProgram {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("1.sayıyı giriniz:");
       int number1= input.nextInt();
       System.out.print("2.sayıyı giriniz.");
       int number2 = input.nextInt();
       
       int ebob=1;
       int ekok;
       
       int i=1;
       while(i<=number1 && i<=number2)
       {
           ++i;
           if(number1%i==0 && number2%i==0)
           {
               ebob=i;
           }
       }
       
       ekok = (number1*number2)/ebob;
       System.out.println(number1 + " " + "ve" + " " + "number2" + "sayılarının EKOK'u:" + ekok);
       System.out.println(number1 + " " + "ve" + " " + "number2" + "sayılarının EBOB'u:" + ebob );
     
       
    
    }
    
    
}
