import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MoviesArrayLists {
    public static void main(String[] args) {
        /*
        1. Import scanner class to take user inputs.
        2. Initialize String Array List.
        3. Prompt user for their favorite movies.
        4. Add them to the array list and use a loop to
        repeat this process until user enters 'q' or 'Q'.
        5. Use a for loop/bubble sort to put them in alphabetical order.
        6. Import random class to suggest a random movie.
         */
        Scanner scn = new Scanner(System.in);

        ArrayList <String> movies = new ArrayList();
        System.out.println("Enter a favorite movie or 'q' to quit: ");
        String user_movie = scn.nextLine();
        movies.add(user_movie);
        String temp = "";
        while(!user_movie.equalsIgnoreCase("q")){
            System.out.println("Enter a favorite movie or 'q' to quit: ");
            user_movie = scn.nextLine();
            if (!user_movie.equalsIgnoreCase("q")) {
                movies.add(user_movie);
            }
            for (int i=0; i<movies.size(); i++){
                for (int j=0; j<movies.size(); j++){
                    if(movies.get(j).compareToIgnoreCase(movies.get(i))>0){
                        temp = movies.get(j);
                        movies.set(j, movies.get(i));
                        movies.set(i, temp);
                    }
                }
            }
        }
        String variableCamel =""+ movies;
        variableCamel = variableCamel.replace(variableCamel.charAt(0), ' ');
        variableCamel = variableCamel.replace(variableCamel.charAt(variableCamel.length()-1), ' ');
        System.out.println("Movies Alphabetically: "+variableCamel);

        Random r = new Random();
        System.out.println("This is my favorite of the bunch: "+movies.get(r.nextInt(movies.size())));




    }
}
