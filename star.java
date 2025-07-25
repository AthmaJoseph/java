import java.util.Scanner;
public class star {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
	int rows,i,j,k;    
        System.out.print("Enter the number of rows for the pyramid: ");
        rows = in.nextInt();      
        for (i = 1; i <= rows; i++) {
        for (j = 1; j <= rows - i; j++) {
        System.out.print(" ");
}
       
        for (k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
}
           
        System.out.println();
}
   
     
    }
}
