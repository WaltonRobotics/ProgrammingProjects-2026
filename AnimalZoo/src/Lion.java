public class Lion extends Animal implements Trainable {

    public Lion(String name, int age, Habitat habitat) {
        super(name, age, habitat);
    }

    @Override
    public void performTrick() {
        System.out.println(m_name+" jumps through a hoop on command.");
    }

    @Override
    public void makeSound() {
        System.out.println(m_name+" lets out a powerful roar!");
    }

    public void hunt() {
        System.out.println(m_name+ " stalks silently through the tall grass.");
    }

}
