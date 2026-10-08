public class Lion extends animal implements Trainable {

    public Lion(String name, int age) {
        super(name, age, Habitat.SAVANNA);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " lets out a powerful roar!");
    }

    public void hunt() {
        System.out.println(getName() + " stalks silently through the tall grass.");
    }

    @Override
    public void performTrick() {
        System.out.println(getName() + " jumps through a hoop on command.");
    }
}