package BitwiseOperators;

public class gates {

	public static void main(String[] args) {
		
		int [][] inputs= {{0,0},{0,1},{1,0},{1,1}};
		int loa=inputs.length;		
		for(int i=0;i<loa;i++) {
			
			int a=inputs[i][0];
			int b=inputs[i][1];
			
			int not=~(a)&1;
			int and=(a&b);
			int or=(a|b);
			int nand=~(a&b)&1;
			int nor=~(a|b)&1;
			int xor=(a^b)&1;
			int xnor=~(a^b)&1;
			
			System.out.println("inputs are ="+a+" "+b);
			System.out.println(not);
			System.out.println(and);
			System.out.println(or);
			System.out.println(nand);
			System.out.println(nor);
			System.out.println(xor);
			System.out.println(xnor);			
		}
	}
}
