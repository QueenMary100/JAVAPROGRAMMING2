//To compare time you need to use builtin functions which takes both hour and minutes
import java.time.*;

public class EveryDayGreeting {

    public static void main(String[] args){
        LocalTime todaytime = LocalTime.now();

        System.out.println("Right now is "+ todaytime);

        LocalTime noon = LocalTime.of(12,0);
        LocalTime evening = LocalTime.of(17,0);

        if(todaytime.isBefore(noon)){
            System.out.println("Good Morning Buddy!");
        }else if(todaytime.isBefore(evening)){
            System.out.println("Good afternoon Buddy!");
        }else{
            System.out.println("Good evening");
        }

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

    }
}
