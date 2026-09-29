public class BlackBear extends Animal{
   public BlackBear(String name, int age){//again, here we are doing the constructor for the habitat and doing it to artic for penguins
   super (name, age, Habitat.FOREST);
  }
  @Override
  public void makeSound(){//here we are overriding the abstract method and creating a new sound only for lion
   System.out.println(getName() + " huffs.");
  }


  public void forage(){//here is the method for the bear forgaing for food
   System.out.println(getName() + " forages for food.");
  }


  public void climbTree(){//here is the method for the bear climbing a tree
   System.out.println(getName() + " climbs a tree.");
  }


  public void hibernate(){//here is the method for the bear hibernating
   System.out.println(getName() + " hibernates.");
  }


  
}


