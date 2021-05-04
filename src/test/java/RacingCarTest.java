import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {
	RacingCar cars;

	@BeforeEach
	void setUp() {
		this.cars = new RacingCar();
		Car car1 = new Car("car1");
		car1.setDistance(1);
		Car car2 = new Car("car2");
		car2.setDistance(2);
		Car car3 = new Car("car3");
		car3.setDistance(3);
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		this.cars.setCars(cars);
	}

	@Test
	@DisplayName("제일 먼거리 가지고 오기")
	void getRacingMaxDistance() {
		assertThat(cars.getRacingMaxDistance()).isEqualTo(3);
	}

	@Test
	@DisplayName("우승자 가져오기")
	void getDistance() {
		assertThat(cars.getRacingWinner()).isEqualTo("car3");
	}
}
