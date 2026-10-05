public class Penguin extends Animal {
    public Penguin(String name, int age) {
    super (name, age, Habitat.ARCTIC);
    }
    @Override
    public String makeSound() {
        return getName() + " lets out a loud honk!";
    }

    public String swim() {
        return getName() + " swims across the ocean to find fish to eat.";
    }

   public String slide() {
        return getName() + " slides across the ice on its belly.";
    }
}
