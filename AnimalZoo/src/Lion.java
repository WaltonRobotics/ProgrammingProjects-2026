public class Lion extends Animal implements Trainable {
    public Lion(String name, int age) {
        super (name, age, Habitat.SAVANNA);
    }
    @Override
    public String makeSound() {
        return getName() + " lets out a powerful roar!";
    }

    @Override
    public String performTrick() {
        return getName() + " jumps through rings of fire.";
    }

    public String hunt() {
        return getName() + " stalks silently through tall grass.";
    }
}
