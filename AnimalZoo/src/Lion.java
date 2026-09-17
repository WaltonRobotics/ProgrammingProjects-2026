import java.util.Random;

public class Lion extends Animal implements Trainable {

    public Lion(String name, int age) {
        super(name, age, Habitat.SAVANNAH);
    }

    @Override
    public String toString() {
        return (m_name + " the lion lives in the " + m_habitat + " where it is " + m_habitat.getTemp() + " degrees fahrenheit and " + m_name + " is " + m_age + " years old");
    }

    @Override
    public void makeSound() {
        Random soundRand = new Random();
        int m_check = soundRand.nextInt(1, 3);
        if(m_check == 1) {
            System.out.println(m_name + " the Lion roars loudly");
        }  
        else if(m_check == 2)  {
            System.out.println(m_name + " the Lion meows softly");
        }
    }

    @Override
    public void performTrick() {
        Random soundRand = new Random();
        int m_check = soundRand.nextInt(1, 4);
        if(m_check == 1) {
            System.out.println(m_name + " the Lion jumps through a hoop of fire");
        }  
        else if(m_check == 2)  {
            System.out.println(m_name + " the Lion eats a chunk of meat in under 3 seconds a new rocord for " + m_name);
        }  
        else if(m_check == 3) {
            System.out.println(m_name + " the lion eats a chunk lf meat in under 5 seconds " + m_name + " looks sad");
        }
    }

    public void hunt() {
        System.out.println(m_name + " the lion kills one of the penguins and eats it right there.");
    }
}
