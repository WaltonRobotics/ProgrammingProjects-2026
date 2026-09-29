 public enum Habitat {//creating a enum for the constant temperatures of the different biomes
   SAVANNA(85),
   ARTIC(-20),
   FOREST(60);


   public final int temperature;
  
   private Habitat( int temperature) {//creating a constructor for the enum that we will set the number for
       this.temperature = temperature;
   }


}
