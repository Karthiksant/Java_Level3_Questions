package TCS_NQT_QUE;
public class Count_No_X_Days {
	public static int countNoOfDays(int noOfDays,String startingDayIs,String givenDayToCount) {
		String[] days= {"mon","tue","wed","thu","fri","sat","sun"};	
		int startingIndexIs=0;
		for(int i=0;i<days.length;i++) {
			if(days[i].equals(startingDayIs)) {
				startingIndexIs=i;
			}
		}
		int count=0;
		// x+1 is formula cause start and end day is counted
		for(int i=0;i<=noOfDays;i++) {
			int dayIndexLooping=((i+(startingIndexIs))%7);
			System.out.print(dayIndexLooping+ " ");
			System.out.println(i+"th Day "+days[dayIndexLooping]);
			boolean b=days[dayIndexLooping].equals(startingDayIs);
			if(b) {
				count++;
			}
		} return count;
	}
	public static void main(String[] args) {
		int noOfDays=15;
		String startingDay="mon";
		String givenDayToCount="mon";
		int noOfXDays=countNoOfDays(noOfDays, startingDay,givenDayToCount);
		System.out.println("no of "+givenDayToCount+"'s are = "+noOfXDays);
	}
}
