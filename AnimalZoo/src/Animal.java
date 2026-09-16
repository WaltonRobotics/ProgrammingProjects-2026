public abstract class Animal {

    protected String m_name;
    protected int m_age;
    protected Habitat m_habitat;

    public Animal(String name, int age, Habitat habitat) {
        m_name = name;
        m_age = age;
        m_habitat = habitat;
    }

    public String getName() {
        return m_name;
    }

    public abstract String toString();

    public abstract void makeSound();
}
