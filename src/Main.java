import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter a number");
        int num=scanner.nextInt();
        System.out.println(num);

        String positivestring="this is the positive string";
        String negativestring="this is the negative string";
        String zerostring="this is the zero string";
        if(num >0){
        System.out.println(positivestring);
        }
        else if(num ==0){System.out.println(zerostring);
            }
            else{
            System.out.println(negativestring);
        }

//        string, int, bool, double
//        string, int, bool, double




}}