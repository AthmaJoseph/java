import java.util.Scanner;
class Agegroup{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter your age");
	int age=in.nextInt();
	if(age>=0 && age<=12){
	System.out.println("You are a child");
}
	else if(age>=13 && age<=19){
	System.out.println("You are a Teenager");
}
	else if(age>=20 && age<=64){
	System.out.println("Adult");
}
	else if(age>=65){
	System.out.println("Senior");
}
	else{
	System.out.println("Sorry please try again");
}
}
}
