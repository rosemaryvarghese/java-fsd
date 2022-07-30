package constructor;
class subject{
	int id=01;
	String name="Maths";

void display() {
	System.out.println(id+" "+name);
	}
}

public class defaultConstructor {

public static void main(String[] args) {

	subject sub1=new subject();
	subject sub2=new subject();

	sub1.display();
	sub2.display();
	}
}

