package Arrays;
public class Non_Present_Element {
	public static void main(String[] args) {
		 System.out.println("asdfg");
		 int [] nums= {1,3,5,9};	
		 int loa=nums.length;
		 int max=nums[0];
		 int min=nums[0];
		 for(int i=0;i<loa;i++) {
			 if(nums[i]>max) {
				 max=nums[i];
			 }
			 if(nums[i]<min) {
				 min=nums[i];
			 }
		 }
		 boolean b=false;
		 for(int i=min;i<=max;i++) {
			 for(int j=0;j<loa;j++) {
				 if((i==nums[j])){
					b=true;
					break;
				 }
			 }
			 if(b==false) {
		     System.out.print(i+" ");
			 }
			 b=false;
		 }
	}
}
