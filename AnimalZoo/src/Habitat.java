public enum Habitat {
    SAVANNAH(85),
    ARTIC(-20),
    Forest(60);

    private int m_temp;

    private Habitat(int tempature) {
        m_temp = tempature;
    }
}
