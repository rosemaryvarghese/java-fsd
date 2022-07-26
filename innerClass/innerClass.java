package innerClass;

class Outer {
	  int a = 300;

	  class Inner {
	    int b = 52;
	  }
	}

	public class innerClass {
	  public static void main(String[] args) {
	    Outer out = new Outer();
	    Outer.Inner in = out.new Inner();
	    System.out.println(in.b * out.a);
	  }
	}

