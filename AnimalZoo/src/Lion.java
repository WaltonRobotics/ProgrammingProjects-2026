public class Lion extends Animal implements Trainable {

    @Override
    public void makeSound(String sound) {
        sound = "roar";
    }

    @Override
    public void performTrick(String trick) {
        trick = "jump through rings of fire";
    }

    public void hunt() {
    }
}
