package Practise_21_AUG;
import java.util.Scanner;
public class No_Of_Pastries {
	public static int maxLeft() {		
		Scanner scanner=new Scanner(System.in);
		  System.out.println("enter number");
		  int input=scanner.nextInt();
		  int leftOver=0;
		  int maxLeftOver=0;
		  if(input<=0) {
			  return 0;
		  }
		  for(int i=1;i<=input;i++) {
			  int n=input;
			  while(n>0) {
				 System.out.println(n+"%"+i+"="+(n%i));
				  n=n%i;
				  if(n>0) {
				  leftOver=n;}
				  n=n/10;
			  }
			  if(leftOver>maxLeftOver) {
				  maxLeftOver=i;
			  }
			 System.out.println();
		  }
		  System.out.println("maxresult = "+maxLeftOver);
		  return maxLeftOver;
		}
	public static void main(String[] args) {
		System.out.println(maxLeft());
	}	  
}
