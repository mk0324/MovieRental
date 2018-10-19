package movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RentalTest {
    private final static int DAY_RENTED = 10;
    private final static String MOVIE_NAME = "개미";

    @Test
    public void getDaysRented() {
        Rental rental = new Rental(new Movie(MOVIE_NAME, Movie.NEW_RELEASE), DAY_RENTED);
        assertEquals(rental.getDaysRented(), DAY_RENTED);
    }

    @Test
    public void getMovie() {
        Movie movie = new Movie(MOVIE_NAME, Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, DAY_RENTED);
        assertNotNull(rental.getMovie());
        assertEquals(movie, rental.getMovie());
    }
}
