import java.util.Random;

public class Penguin extends Animal{
    
    public Penguin(String name, int age) {
        super(name, age, Habitat.ARTIC);
    }

    @Override
    public String toString() {
        return (m_name + " the Penguin lives in the " + m_habitat + " where it is " + m_habitat.getTemp() + " degrees fahrenheit and " + m_name + " is " + m_age + " years old");
    }

    @Override
    public void makeSound() {
        Random soundRand = new Random();
        int m_check = soundRand.nextInt(1, 3);
        if(m_check == 1) {
            System.out.println(m_name + " the Penguin honks");
        }  
        else if(m_check == 2)  {
            System.out.println(m_name + " the Penguin stares into your soul and says nothing, the farts");
        }
    }

    public void swim() {
        System.out.println(m_name + " swims in a figure 8");
    }

    public void slide() {
        System.out.println(m_name + " slides gracefully on its belly");
    }
}
