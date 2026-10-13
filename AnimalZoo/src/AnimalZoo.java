public class AnimalZoo {
    public static void main(String[] args) {

        Lion leo = new Lion("Leo", 5);
        Penguin pip = new Penguin("Pip", 3);
        BlackBear baloo = new BlackBear("Baloo", 7);

        // Lion :)
        System.out.println(leo);
        leo.makeSound();
        leo.hunt();
        leo.performTrick();

        System.out.println();

        // Penguin <3
        System.out.println(pip);
        pip.makeSound();
        pip.swim();
        pip.slide();

        System.out.println();

        // Black Bear :(
        System.out.println(baloo);
        baloo.makeSound();
        baloo.forage();
        baloo.climbTree();
        baloo.hibernate();
    }
}