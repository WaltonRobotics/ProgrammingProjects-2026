public class AnimalZoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Leo", 5);
        Penguin penguin = new Penguin("Pip", 3);
        BlackBear bear = new BlackBear("Baloo", 7);

        System.out.println(lion);
        lion.makeSound();
        lion.hunt();
        lion.performTrick();

        System.out.println(); 

        System.out.println(penguin);
        penguin.makeSound();
        penguin.swim();
        penguin.slide();

        System.out.println();

        System.out.println(bear);
        bear.makeSound();
        bear.forage();
        bear.climbTree();
    }
}