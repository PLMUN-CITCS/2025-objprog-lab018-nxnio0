import java.util.Scanner;
public class EvenOddChecker{
    public static void main(String[] args) {
        getIntegerInput();
    }
    public static void getIntegerInput(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = scan.nextInt();

        checkOddEven(num);


    }

    public static void checkOddEven(int num){
        if (num % 2 == 0){
            System.out.print(num + " is an Even Number.");
        } else if (num % 2 != 0){
            System.out.print(num + " is an Odd Number.");
        } else {
            System.out.print("Invalid Input");
        }
    }

}
