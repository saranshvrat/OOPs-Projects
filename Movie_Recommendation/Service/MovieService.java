package Service;

import Interface.RecommendationEngine;

public class MovieService {
    private RecommendationEngine engine;

    public MovieService(RecommendationEngine engine)
    {
        this.engine = engine;
    }

    public void recommend()
    {
        engine.recommendMovie();
    }
}
