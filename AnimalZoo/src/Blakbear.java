public class Blakbear extends animal {


    public Blakbear(String name, int age) {
        super(name, age, Habitat.FOREST);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " lets out a low growl.");
    }

    public void forage() {
        System.out.println(getName() + " searches the forest floor for berries.");
    }

    public void climbTree() {
        System.out.println(getName() + " climbs a tree with surprising speed.");
    }

    public void hibernate() {
        System.out.println(getName() + " settles into its den for the winter.");
    }
}