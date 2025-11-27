package challenge;

public class Palindrone_check {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		String rev = "";
		String rep = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(rep);
		for (int i= rep.length()-1; i >=0; i--) {
			rev=rev+rep.charAt(i);
		}
		if (s.equalsIgnoreCase(rep)) {
			System.out.println("True");
		}
		else
			System.out.println("False");

	}

}
