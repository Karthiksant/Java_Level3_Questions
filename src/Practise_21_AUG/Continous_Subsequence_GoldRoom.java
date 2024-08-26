package Practise_21_AUG;
import java.util.Scanner;
public class Continous_Subsequence_GoldRoom{
	    public static void main(String[] args) {    	
	    	int []array1= {5, 3, 7, 14, 18, 1, 18, 4, 8, 3};
	    	int size=array1.length;
	    	int maxprice=15;
	       for(int i=0;i<size;i++) {
	    	   int sum=0;
	    	   int k=i;
	    	   int startIndex=i;
		       int endingIndex=2;
	    	   while(sum<=maxprice) {
	    		   if(k<size) {
	    		   sum=sum+array1[k++];
	    		   }
	    		  if(sum==15) {
	    			  if(i<startIndex) {
	    				 startIndex=i; 
	    			  }
	    			  if(k-1>endingIndex) {
	    				  endingIndex=k-1;
	    			  }
	    			  break;
	    		  } 
	    	   }	
	    	   if(sum==15) {
	    		   System.out.println(startIndex+" --- ");
	    		   System.out.println(endingIndex+" --- ");
	    		   System.out.println(sum);
	    	   }
	     } 
	   }    
	}
