public class Penguin extends animal {

    public Penguin(String name, int age) {
        super(name, age, Habitat.ARCTIC);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " lets out a loud honk!");
    }

    public void swim() {
        System.out.println(getName() + " swims through the icy water.");
    }

    public void slide() {
        System.out.println(getName() + " slides across the ice on its belly.");
    }
}