public abstract class Animal {
    private String m_name;
    private int m_age;
    private String m_habitat;

    public void getName(String name) {
        m_name = name;
    }

    public void toString() {

    }

    public abstract void makeSound(String sound);
}
