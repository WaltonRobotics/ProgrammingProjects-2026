public class Penguin extends Animal implements Trainable  {

    public Penguin(String name, int age, Habitat habitat) {
        super(name, age, habitat);
    }

    @Override
    public void performTrick() {
        System.out.println("I am Penguin");
        throw new UnsupportedOperationException("Unimplemented method 'performTrick'");
    }

    @Override
    public void makeSound() {
        System.out.println(m_name+" lets out a loud honk!");
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

    public void swim() {
        System.out.println("Penguin swims");
    }

    public void slide() {
        System.out.println(m_name+" slides across the ice on its belly.");
    }

}
