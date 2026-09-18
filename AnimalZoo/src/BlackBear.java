import java.util.Random;

public class BlackBear extends Animal{
    public BlackBear(String name, int age) {
        super(name, age, Habitat.FOREST);
    }

    @Override
    public String toString() {
        return (m_name + " the Black Bear lives in the " + m_habitat + " where it is " + m_habitat.getTemp() + " degrees fahrenheit and " + m_name + " is " + m_age + " years old");
    }

    @Override
    public void makeSound() {
        Random soundRand = new Random();
        int m_check = soundRand.nextInt(1, 3);
        if(m_check == 1) {
            System.out.println(m_name + " the Black bear growels loudly");
        }  
        else if(m_check == 2)  {
            System.out.println(m_name + " the Black Bear makes a terrifying roar");
        }
    }

    public void forage() {
        System.out.println(m_name + " the Black Bear gets berries from a near by bush and eats it right there.");
    }

    public void climbTree() {
        System.out.println(m_name + " the Black Bear climbs a nearby tree");
    }

    public void hibernate() {
        System.out.println(m_name + " the Black Bear goes to sleep");
    }
}
