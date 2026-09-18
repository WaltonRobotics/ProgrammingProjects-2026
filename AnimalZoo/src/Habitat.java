public enum Habitat {

        SAVANNA(85),
        ARCTIC (-20),
        FOREST (60);

        public final int temp;
        private Habitat(int temp) {
            this.temp = temp;
        }
       
}
