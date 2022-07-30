package constructor;

class Subject{
	int id;
	String sname;

	Subject(int i,String n)
	{
	id=i;
	sname=n;
	}

	void display() {
	System.out.println(id+" "+sname);
	}
}

public class parameterizedConstructor {
public static void main(String[] args) {

	Subject s1=new Subject(1,"Maths");
	Subject s2=new Subject(2,"English");
	s1.display();
	s2.display();
		}
}


