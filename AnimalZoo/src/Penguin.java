public class Penguin extends Animal {

    public Penguin(String name, int age) {
        super(name, age, Habitat.ARCTIC);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "lets out a loud honk.");
    }

    public void swim() {
        System.out.println(getName() + "glides on the ice.");
    }

    public void slide() {
        System.out.println(getName() + "slides across the ice on its belly.");
    }
}