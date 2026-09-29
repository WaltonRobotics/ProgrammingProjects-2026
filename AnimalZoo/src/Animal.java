public abstract class Animal {//here is the abstract class for the name, age, and habitat for the animal to fill in with its own class


       public  String name;
       public  int age;
       public  Habitat habitat;


       public Animal(String name, int age, Habitat habitat){ //creating a constructor for all the variables
           this.name = name;
           this.age = age;
           this.habitat = habitat;
       }


       public String getName(){//here is the getter for the name
           return name;
       }
       @Override
       public String toString(){//here is the toString method that will return the name, age, and habitat
           return "Name:" + name + " Age: " + age + " Habitat: " + habitat;
       }


       public abstract void makeSound();//here is the abstract method for each animal that will make its own sound


   }
