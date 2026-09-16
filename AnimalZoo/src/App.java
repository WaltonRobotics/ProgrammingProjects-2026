public class App {
    public static void main(String[] args) throws Exception {
        Lion lion = new Lion("Billy", 3);
        Penguin penguin = new Penguin("Bob", 2);
        BlackBear blackBear = new BlackBear("Boby", 4);

        lion.toString();
        lion.makeSound();
        lion.hunt();
        lion.performTrick();

        penguin.toString();
        penguin.makeSound();
        penguin.slide();
        penguin.swim();

        blackBear.toString();
        blackBear.makeSound();
        blackBear.forage();
        blackBear.climbTree();
        blackBear.hibernate();
    }
}
