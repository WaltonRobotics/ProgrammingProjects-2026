public class BlackBear extends Animal {
    public BlackBear(String name, int age) {
        super (name, age, Habitat.FOREST);
    }

    @Override
    public String makeSound() {
        return getName() + " lets out a low growl.";
    }

    public String forage() {
        return getName() + " searches the forest floor for berries.";
    }

    public String climbTree() {
        return getName() + " climbs a tree with surprising speed.";
    }

    public String hibernate() {
        return getName() + " hibernates for all of the winter months.";
    }
}