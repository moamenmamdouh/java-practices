package tau;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args){

        String [] weekDays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int userInput = getDayNumber();
        printDay(weekDays, userInput);
    }

    public static int getDayNumber(){
        System.out.println("Please Enter a Day number in the week:");
        Scanner input = new Scanner(System.in);
        int output = input.nextInt();
        input.close();
        return output;
    }

    public static void printDay(String[] arr, int num){
        System.out.println(arr[num-1]);
    }

}
