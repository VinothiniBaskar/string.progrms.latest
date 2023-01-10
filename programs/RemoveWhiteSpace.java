package string.programs;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str="vino   dr";
		str=str.replaceAll("\\s", "");
 
        System.out.println(str);

	}

}
