import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ClassicMovies {
    public static void main(String[] args) {
        String shortMovieName = null;
        int shortMovieDuration = 0;
        String longMovieName = null;
        int longMovieDuration = 0;
        try (Scanner file = new Scanner(new File("movies.txt"))) {
            while (file.hasNext()) {
                String movieName = file.nextLine();
                int duration = file.nextInt();
                if (file.hasNext()) {
                    file.nextLine();
                }
                if (shortMovieName == null) {
                    shortMovieName = movieName;
                    shortMovieDuration = duration;
                    longMovieName = movieName;
                    longMovieDuration = duration;
                } else {
                    if (duration > longMovieDuration) {
                        longMovieDuration = duration;
                        longMovieName = movieName;
                    }
                    if (duration < shortMovieDuration) {
                        shortMovieDuration = duration;
                        shortMovieName = movieName;
                    }
                }
            }
         } catch (FileNotFoundException exception) {
            System.out.println("Unable to fine movies.txt");
        } catch (Exception exception) {
            System.out.println("unable to extract data from move.txt");
        }
        printAndSaveData(shortMovieDuration, shortMovieName, longMovieDuration, longMovieName);
    }
  }
    private static void printAndSaveData(int shortMovieDuration, String shortMovieName, int longMovieDuration, String longMovieName){
        if (shortMovieName != null) {
            String shortMovieDetails = shortMovieName + " " + shortMovieDuration;
            String longMovieDetails = longMovieName + " " + longMovieDuration;
            System.out.println(shortMovieDetails);
            System.out.println(longMovieDetails);
            try(FileOutputStream fos = new FileOutputStream("MoviesOutPut.txt")) {
                fos.write(shortMovieDetails.getBytes());
                fos.write(System.lineSeparator().getBytes());
                fos.write(longMovieDetails.getBytes());
            } catch (IOException exception){
                System.out.println("Unable to Write to File");
            }
        } else {
            System.out.println("Unable to find the data from file");
        }
    }
}
