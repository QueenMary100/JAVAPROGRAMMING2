import java.util.*;

public class BmiExceptionHandling{

    pulic static void main(String[] args){

        double weight;
        double height;
        double bmi;

        Scanner Sc = new Scanner(System.in);

        try{
            
            System.Out.println("Enter your weight in kg");
            weight = Sc.nextDouble();
            System.Out.println("Enter your height in kg");
            height = Sc.nextDouble();        

            if(height == 0 || weight == 0)
            {
                throw new IllegalArgumentException("Weight and height must be positive numbers");
            }

            bmi = weight/(Math.Pow(height,2));
            System.out.printf("Your BMI is %.2f",bmi);

        }catch(InputMismatchException ext){
            
            System.out.println("Input must be numeric numbers");

        }finally{
            Sc.close();
        }
    }
}