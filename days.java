import java.util.Scanner;

public class days {
    public static void main(String[]args){

        Scanner abc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("enter your number: ");
        
        int day = abc.nextInt();
        
        switch (day){

        case 1 :
            System.out.println("Monday");
            break;
            
        case 2:
            System.out.println("tuesday");
            break;
         
        case 3:
            System.out.println("wednesday");
            break;

            case 4 :
            System.out.println("thursday");
            break;
            
        case 5:
            System.out.println("friday");
            break;
        
        case 6:
            System.out.println("saturday");
            break;
        
            case 7:
            System.out.println("sunday");
            break;

        default:
            System.out.println("you did not match any of the cases");
        }

       
    }
}
