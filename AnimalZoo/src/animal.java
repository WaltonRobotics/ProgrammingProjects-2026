public abstract class animal {
    private String name;
    private int age;
    private Habitat habitat;

    public animal(String name, int age, Habitat habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old) lives in the "
                + habitat + ", where it's usually "
                + habitat.getTemperature() + "°F.";
    }

    public abstract void makeSound();
}