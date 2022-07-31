package classObject;

class Animal {
	  public void animalSound() {
	    System.out.println("ANIMAL");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("PIG");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("DOG");
	  }
	}

	class Polymorphism {
	  public static void main(String[] args) {
	    Animal myAnimal = new Animal();  
	    Animal myPig = new Pig();  
	    Animal myDog = new Dog();  
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	  }
	}