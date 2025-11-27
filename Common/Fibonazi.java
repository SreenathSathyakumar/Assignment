package Common;

public class Fibonazi {

	public static void main(String[] args) {
int num=10;
int a=0;
int b=1;
System.out.print(a+ " " + b);
for(int i=2;i<num;i++ ) {
	a=a+b;
	b=b-a;
	System.out.print(b);
}
	}

}
