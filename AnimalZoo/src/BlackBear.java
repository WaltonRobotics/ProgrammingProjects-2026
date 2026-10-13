public class BlackBear extends Animal implements Trainable {

    public BlackBear(String name, int age, Habitat habitat) {
        super(name, age, habitat);
    }

    @Override
    public void performTrick() {
        System.out.println("I am Black Bear");
        throw new UnsupportedOperationException("Unimplemented method 'performTrick'");
    }

    @Override
    public void makeSound() {
        System.out.println(m_name+" lets out a low growl.");
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

     public void forage() {
        System.out.println(m_name+" searches the forest floor for berries.");
    }

    public void climbTree() {
        System.out.println(m_name+" climbs a tree with surprising speed.");
    }

    public void hibernate() {
        System.out.println(m_name+ " hibernate");
    }

}
