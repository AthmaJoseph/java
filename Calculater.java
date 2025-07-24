import java.util.Scanner;
class Calculater{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Please enter two numbers");
	float x=in.nextFloat();
	float y=in.nextFloat();
	System.out.println("Please select one operator");
	System.out.println("Addition(+)\nSubstraction(-)\nMultipilcation(*)\nDivision(/) ");
	char n=in.next().charAt(0);
	
	if(n=='+'){
	float z=x+y;
	System.out.println("Sum is "+z);	
}
	else if(n=='-'){
	float z=x-y;
	System.out.println("Difference is "+z);	
}
	else if(n=='*'){
	float z=x*y;
	System.out.println("Product is "+z);
}
	else if(n=='/'){
	float z=x/y;
	System.out.println("Quotient is "+z);
	
}
	else{
	System.out.println("Please select valid option ");
}	

}
}