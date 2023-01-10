package string.programs;

public class NumberOfOccurences {

	public static void main(String[] args) {
		String str="automation testing";
		int totalCount=str.length();
		int afterCountRemove=str.replace("a", "").length();
		int count=totalCount-afterCountRemove;
		System.out.println("The number of occurences of t is :"+count);
		
	
	}

}
