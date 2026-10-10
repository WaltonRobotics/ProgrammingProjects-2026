public class Lion extends Animal implements Trainable {

    public Lion(String name, int age) {
        super(name, age, Habitat.SAVANNA);
    }
    public void makeSound() {
        System.out.println(getName() + "lets out a powerful roar.");
    }
    public void hunt() {
        System.out.println(getName() + "stalks in the tall grass.");
    }
    public void performTrick() {
        System.out.println(getName() + "jumps through a hoop.");
    }
}