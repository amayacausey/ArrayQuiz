import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int[] numbers={25,14,56,15,36,56,77,18,29,49};
        System.out.println(Arrays.toString(numbers));

        System.out.println("Please enter a number from the array ");
        int userInput=sc.nextInt();
        sc.nextLine();

        for (int i=0; i<numbers.length;i++) {
            if (numbers[i] == userInput) {
                System.out.println("The index is " + i);
            }
        }

           String[] month={"January","February","March","April","May","June","July","August",
                   "September","October","November","December"};
            System.out.println(Arrays.toString(month));
            System.out.println("Please enter a month from the array above");
            String userMonth=sc.nextLine();
        for (int j=0; j<month.length;j++)
            if(month[j].equalsIgnoreCase(userMonth))
            {
                System.out.println("The index of the month is " +j);
            }


    }


    }


