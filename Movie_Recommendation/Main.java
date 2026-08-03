import Interface.RecommendationEngine;
import Platforms.*;
import Service.MovieService;

public class Main {
    public static void main(String[] args) {

        RecommendationEngine engine1 = new NetflixEngine();

        MovieService service1 = new MovieService(engine1);

        service1.recommend();
        
        RecommendationEngine engine2 = new AmazonPrimeEngine();

        MovieService service2 = new MovieService(engine2);

        service2.recommend();
    }
}