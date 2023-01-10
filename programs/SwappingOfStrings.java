package string.programs;

public class SwappingOfStrings {

	public static void main(String[] args) {
		String a="vino";
		String b="baskar";
		System.out.println("Before Swapping of and b  value is :"+a+ " "+b);
		
		//add a and b  strings in a
		//a length is 4
		//b length is 6
		//v i n o b a s k a r
		//0 1 2 3 4 5 6 7 8 9 ==>10
		a=a+b;
		
		//split the a and store in b
		// 10-6 ==>4
		//In a -->vinobaskar --> Taked the first 4 letters
		b=a.substring(0, a.length()-b.length());
		
		//split the b from a and store in a
		//Now b length is 4
		//In a string-->vinobaskar -->omits the first four and takes rest and store in a
		a=a.substring(b.length());
		
		System.out.println("After Swapping of and b  value is :"+a+ " "+b);


	}

}
