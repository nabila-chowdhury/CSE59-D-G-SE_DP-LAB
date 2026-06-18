
class Applet {
    public void launch() {
        System.out.println("Applet launched");
    }
}


class GameApplet extends Applet {
    public void play() {
        System.out.println("Playing game");
    }
}


public class Main6 {
    public static void main(String[] args) {
        // Creating an object of the derived class
        GameApplet myGame = new GameApplet();

        // Calling the inherited method from the base class
        myGame.launch();

        // Calling the method from the derived class
        myGame.play();
    }
}
