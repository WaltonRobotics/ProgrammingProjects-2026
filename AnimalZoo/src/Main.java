 public class Main{
   public static void main(String[] args){
       Lion lion = new Lion("Leo" , 5);//creating one of each class, lion penguin, and black bear
       Penguin penguin = new Penguin("Pip", 3);
       BlackBear blackBear = new BlackBear("Baloo" , 7);


       System.out.println(lion.toString());//here we are calling the toString method for each animal and then calling the other methods for each animal
       lion.makeSound();
       lion.hunt();
       lion.performTrick();


       System.out.println(penguin.toString());
       penguin.makeSound();
       penguin.swim();
       penguin.slide();


       System.out.println(blackBear.toString());
       blackBear.makeSound();
       blackBear.forage();
       blackBear.climbTree();
       blackBear.hibernate();


   }
}


 
