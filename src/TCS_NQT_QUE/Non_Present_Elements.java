package TCS_NQT_QUE;
public class Non_Present_Elements {
	public static void main(String[] args) {
		int nums[]= {3,5,1,9,9};
		for(int i=1;i<=10;i++) {
			boolean isPresent=false;
			for(int j=0;j<nums.length;j++) {
				if(i==nums[j]){
					isPresent=false;
					break;
				 }else {
					isPresent=true;
				  }
				}
			if(isPresent) { System.out.print(i+" ");}
			}
		}
	}
