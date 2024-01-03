import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<String> movies = new ArrayList<>();

        movies.add("Harry Potter");
        movies.add("Kingsmen");
        movies.add("The Hobbit");
        movies.add("Lord of the ring");
        movies.add("Troy");
  
        movies.remove("The Hobbit");

        for(String Movies : movies)
        {
            System.out.println(Movies);
        }

    }
}
