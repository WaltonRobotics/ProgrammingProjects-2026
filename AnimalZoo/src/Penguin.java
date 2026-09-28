public class Penguin extends Animal {//we are only extending it and not implementing the trainable because penguiuns cannot do tricks
   public Penguin(String name, int age){//again, here we are doing the constructor for the habitat and doing it to artic for penguins
   super (name, age, Habitat.ARTIC);
  }
 
  public void swim(){//here is the method for the swimming penguins
   System.out.println(getName() + " swims.");
  }


  public void slide(){
   System.out.println(getName() + "slides.");
  }
   @Override
  public void makeSound(){//here we are overriding the abstract method and creating a new sound only for lion
   System.out.println(getName() + " squawks.");
  }
}

  
