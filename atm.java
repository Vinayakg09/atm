import java.util.*;

public class p2 {
    public static void main(String agrs[]){
        System.out.println("Pls enter your pin no.");
        Scanner me = new Scanner(System.in);
        int pin = me.nextInt();
        int balance = 10000;
        int a = 1910;
        if (pin == a){
            System.out.println("Select options:");
            System.out.println("1.Check balance");
            System.out.println("2.Withdraw money");
            System.out.println("3.Credit money");
            int b = me.nextInt();
            switch(b){
                case 1:
                System.out.println("Balance: "+balance);
                break;
                case 2:
                System.out.println("Enter amount to withdraw:");
                int x = me.nextInt();
                if(x > balance){
                    System.out.println("Insufficient balance");
                }
                else {
                System.out.println("Updated balance: "+(balance-x));
                }
                break;
                case 3:
                System.out.println("Enter amount to credit:");
                int y = me.nextInt();
                System.out.println("Updated balance: "+(balance+y));
            }
        }
        else {
            System.out.println("Incorrect Pin");
            System.out.println("Try again");
        }
         System.out.println("Thankyou!");
    }  
}
