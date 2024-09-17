import java.util.*; 

public class BMIAPP{

    public static void main(String[] args){
        double weight;
        double height;
        double bmi;
        
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter your weight in kg");
        weight = Sc.nextDouble();
        System.out.println("Enter your height in kg");
        height = Sc.nextDouble();

        bmi = weight/(height * height);

        System.out.printf("Your BMI is %.2f",bmi);
        
    }
}
