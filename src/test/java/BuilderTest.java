import com.implementation.builder.CarBuilder;
import com.implementation.builder.CarManualBuilder;
import com.implementation.builder.Director;
import com.implementation.model.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.implementation.model.CarManual;
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

    @Test
    public void buildManual(){
        Director director = new Director();
        CarManualBuilder builder = new CarManualBuilder();
        builder.setSeats(2);
        builder.setGPS();
        builder.setTripComputer();
        director.makeSuv(builder);

        CarManual manual = builder.getResult();

        assertEquals(2, manual.getSeats());
        assertEquals("SUV Engine", manual.getEngine().getType());
        assertEquals("Gps", manual.getGps());
        assertEquals("TripComputer", manual.getTripComputer());
    }
}
