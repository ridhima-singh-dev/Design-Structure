package facade;

public class Client {
//This pattern is used to refactor the complex code and to make the code simple and readable
// This is a structural design pattern
	public static void main(String[] args) {
		HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        // Watching a movie
        homeTheater.watchMovie();

        // Ending the movie and shutting down
        homeTheater.endMovie();

	}

}
