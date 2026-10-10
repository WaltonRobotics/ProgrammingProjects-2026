public abstract class Animal {
    private String name;
    private int age;
    private Habitat habitat;

    public Animal(String name, int age, Habitat habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }
    public String getName() {
        return name;
    }
    public abstract void makeSound();
    public String toString() {
        return name + " ("+ age + "years old) lives in the " + habitat + 
        ", and the tempurture is" + habitat.getTemperature() +"°F.";
    }
}