package facade;

public class HomeTheaterFacade {
	private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade() {
        amplifier = new Amplifier();
        dvdPlayer = new DVDPlayer();
        projector = new Projector();
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        amplifier.turnOn();
        dvdPlayer.play();
        projector.start();
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.stop();
        projector.stop();
        amplifier.turnOff();
    }
}
