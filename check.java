import java.util.Scanner;
class check{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=sc.nextInt();
	if(a>=0){
		if(a%2==0){
		System.out.println("Your number is Even");
		
}
		else{
		System.out.println("Your number is Odd");
}
}
		else{
		System.out.println("Your number is negative");

}
}}