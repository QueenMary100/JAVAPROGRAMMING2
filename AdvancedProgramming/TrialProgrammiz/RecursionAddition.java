
public class RecursionAddition {

    public static void main(String[] args) {
        int summation = sum(10);
        System.out.println("The summation of numbers from 0 to 10 is "+ summation);
        
    }

    public static int sum(int maxnumber){
        if(maxnumber > 0){
            return maxnumber + sum(maxnumber - 1);
        }else{
            return  0;
        }
    }

}
