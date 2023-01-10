package string.programs;

public class ReversedNumber {

	public static void main(String[] args) {
		int number=123,reminder;
		int reverse=0;
		System.out.println("The  number is :"+number);
		while(number!=0) {
			reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
		
		System.out.println("The reversed number is :"+reverse);

	}

}
 