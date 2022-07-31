package classObject;

class Bird {

	  // field and method of the parent class
	  String name;
	  public void eat() {
	    System.out.println("I am a bird");
	  }
	}

	// inherit from Animal
	class Parrot extends Bird {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

	class Inheritance {
	  public static void main(String[] args) {

	    
	    Parrot p = new Parrot();

	    // access field of superclass
	    p.name = "Ronnie";
	    p.display();

	    // call method of superclass
	    // using object of subclass
	    p.eat();

	  }
	}