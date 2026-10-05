public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Leo", 5);
        Penguin penguin = new Penguin("Pip", 3);
        BlackBear blackBear = new BlackBear("Baoloo", 7);

        System.out.println(lion.toString());
        System.out.println(lion.makeSound());
        System.out.println(lion.hunt());
        System.out.println(lion.performTrick());

        System.out.println(penguin.toString());
        System.out.println(penguin.makeSound());
        System.out.println(penguin.swim());
        System.out.println(penguin.slide());

        System.out.println(blackBear.toString());
        System.out.println(blackBear.makeSound());
        System.out.println(blackBear.climbTree());
        System.out.println(blackBear.hibernate());
    }
}
