package Common;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=20;
		int numberoffactors=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				numberoffactors++;
		}
		if(numberoffactors>2)
			System.out.println("not prime");
		
		else{
		System.out.println(" prime");
		}
	}

}
