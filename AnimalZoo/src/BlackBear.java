public class BlackBear extends Animal {

    public BlackBear(String name, int age) {
        super(name, age, Habitat.FOREST);
    }

    public void makeSound() {
        System.out.println(getName() + " lets out a low growl.");
    }
    public void forage() {
        System.out.println(getName() + " searches for food.");
    }
    public void climbTree() {
        System.out.println(getName() + " climbs a tree.");
    }
    public void hibernate() {
        System.out.println(getName() + " curls up in a den for winter.");
    }
}