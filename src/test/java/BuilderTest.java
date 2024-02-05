import com.implementation.builder.CarBuilder;
import com.implementation.builder.Director;
import com.implementation.model.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
    public void buildCar(){
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        builder.setSeats(5);
        builder.setGPS();
        builder.setTripComputer();
        director.makeSportCar(builder);

        Car car = builder.getResult();

        assertEquals(5, car.getSeats());
        assertEquals("Sport Engine", car.getEngine().getType());
        assertEquals("Gps", car.getGps());
        assertEquals("TripComputer", car.getTripComputer());
    }
}
