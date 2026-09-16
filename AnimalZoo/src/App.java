public class App {
    public static void main(String[] args) throws Exception {
        Lion lion = new Lion("Billy", 3);
        Penguin penguin = new Penguin("Bob", 2);
        BlackBear blackBear = new BlackBear("Boby", 4);

        System.out.println(lion.toString());
        lion.makeSound();
        lion.hunt();
        lion.performTrick();

        System.out.println(penguin.toString());
        penguin.makeSound();
        penguin.slide();
        penguin.swim();

        System.out.println(blackBear.toString());
        blackBear.makeSound();
        blackBear.forage();
        blackBear.climbTree();
        blackBear.hibernate();
    }
}
