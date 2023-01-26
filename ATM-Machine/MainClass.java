import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        AtmFunctionImp op = new AtmFunctionImp();
        Scanner sc = new Scanner(System.in);

        int atmnumber=12345;
        int atmpin=1234;

        System.out.println("Welcome to ATM Machine !!!");

        System.out.print("Enter Atm Number : ");
        int atmNumber=sc.nextInt();

        System.out.print("Enter Pin: ");
        int pin=sc.nextInt();
        System.out.println();

        if((atmnumber==atmNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println();
                System.out.print("Enter Choice : ");
                int ch=sc.nextInt();

                if(ch==1){
                    op.viewBalance();
                    System.out.println();
                }
                else if(ch==2){
                    System.out.print("Enter amount to withdraw :-");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                    System.out.println();
                }
                else if(ch==3){
                    System.out.print("Enter Amount to Deposit :-");
                    double depositAmount=sc.nextDouble();
                    op.depositAmount(depositAmount);
                    System.out.println();
                }
                else if(ch==4){
                    op.viewMiniStatement();
                    System.out.println();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.out.println();
                    System.exit(0);
                }
                else{
                    System.out.println();
                    System.out.println("Please enter correct choice:::");
                    System.out.println();
                }
            }
        }
        else{
            System.out.println();
            System.out.println("Incorrect Atm Number or pin:::");
            System.exit(0);
        }

        sc.close();
    }
}
