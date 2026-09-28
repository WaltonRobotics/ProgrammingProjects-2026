public class Lion extends Animal implements Trainable{//creating the child class and that it can do tricks
  public Lion(String name, int age){//here we are doing the constructor for the habitat and setting it to savanna
   super (name, age, Habitat.SAVANNA);
  }


  @Override
  public void makeSound(){//here we are overriding the abstract method and creating a new sound only for lion
   System.out.println(getName() +" roars");
  }


  public void hunt(){//here is a method just for the lion to hunt
   System.out.println(getName() + " hunts for food");
  }


  public void performTrick(){//here is a method just for the lion to perform a trick
   System.out.println(getName() + " waves to the crowd");
  }
}
