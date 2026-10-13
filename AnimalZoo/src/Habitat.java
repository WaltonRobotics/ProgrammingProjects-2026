public enum Habitat {
    SAVANNA(85),
    ARCTIC(-20),
    FOREST(60);
    
    private final int temperatureFahrenheit;

    // Constructor for the enum
    Habitat(int temperatureFahrenheit) {
        this.temperatureFahrenheit = temperatureFahrenheit;
    }

    // Getter method to retrieve the temperature
    public int getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

}
