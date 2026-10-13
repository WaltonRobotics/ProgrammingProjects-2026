public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to AnimalZoo!!");

        Lion lion = new Lion("Leo", 5, Habitat.SAVANNA);
        Penguin penguin = new Penguin("Pip", 2, Habitat.ARCTIC);
        BlackBear blackBear = new BlackBear("Baloo", 7, Habitat.FOREST);

        System.out.println("---------------------------------------");
        System.out.println(lion.toString());
        lion.makeSound();
        lion.hunt();
        lion.performTrick();
        System.out.println("---------------------------------------");

        System.out.println(penguin.toString());
        penguin.swim();
        penguin.slide();
        System.out.println("---------------------------------------");

        System.out.println(blackBear.toString());
        blackBear.forage();
        blackBear.climbTree();
        blackBear.hibernate();
        System.out.println("---------------------------------------");
    }
}
