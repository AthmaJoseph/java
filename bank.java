//Create a virtual banking s/m using switch case ask the choices from the user and based on the choices implement the banking operations.if the user enter one user is able to deposite the amount.if the user enters two then show the balance.if the user enters 
//three then implement withdrawal.






import java.util.Scanner;
class bank{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Select one option \n 1- Deposite \n 2- withdraw");
	int n=in.nextInt();
	int ac=1000;
	switch(n){
	case 1:
	System.out.println("Enter amount you want to deposite");
	int depo=in.nextInt();
	int account=ac+depo;
	System.out.println("Thanku your account balance is "+account);
	break;
	case 2:
	System.out.println("Enter amount you want to withdraw");
	int with=in.nextInt();
	account=ac-with;
	System.out.println("Your balance is"+account);
	break;
	default:
	System.out.println("Sorry");

}
	

}

}
