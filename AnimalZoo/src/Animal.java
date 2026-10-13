public abstract class Animal {

    public String m_name;
    public int m_age;
    public Habitat m_habitat;

    public Animal(String name, int age, Habitat habitat) {
        m_name = name;
        m_age = age;
        m_habitat = habitat;
    }

    public String getName() {
        return m_name;
    }

    @Override
    public String toString() {
        return m_name + "(" + m_age + " years old) lives in the " 
        + m_habitat.name()+", where it's usually " + m_habitat.getTemperatureFahrenheit() + "°F.";
    }

    public abstract void makeSound();

}
