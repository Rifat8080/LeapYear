import java.util.Scanner;

class LeapYear1{
    public int y;
    LeapYear1(){
        System.out.println("Enter the year: ");
        Scanner input = new Scanner(System.in);
        y = input.nextInt();
        input.close();
    }
    void check(){
        if (y%400==0 || (y%4==0 && y%100!=0)){
            System.out.println("Leap Year");
        } else{
            System.out.println("Not a Leap Year");
        }
    }
}

public class LeapYear {
    public static void main(String[] args) {
       LeapYear1 obj = new LeapYear1();
       obj.check();
    }
}
