public enum Habitat {
    SAVANNA(85),
    ARCTIC(-20),
    FOREST(60);

    private final int temperature;
    Habitat(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
}