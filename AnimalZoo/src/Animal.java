public abstract class Animal {

    private String m_name;
    private int m_age;
    private Habitat m_habitat;

    public Animal(String name, int age, Habitat habitat) {
        m_name = name;
        m_age = age;
        m_habitat = habitat;
    }

    public String getName() {
        return m_name;
    }

    
}
