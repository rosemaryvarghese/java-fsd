package methods;

public class methodExample {

public int add(int a,int b) {
	int sum=a*b;
	return sum;
}

public static void main(String[] args) {

	methodExample b=new methodExample();
	int res= b.add(55,34);
	System.out.println("Sum = "+res);
	}}
