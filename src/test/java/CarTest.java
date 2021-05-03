import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	Car car;

	@BeforeEach
	void setUp() {
		car = new Car("name");
	}

	@Test
	@DisplayName("car 이름")
	void getName() {
		assertThat(car.getName()).isEqualTo("name");
	}

	@Test
	@DisplayName("car 경주 거리")
	void getDistance() {
		car.racing(2);
		assertThat(car.getDistance()).isEqualTo("");
		car.racing(5);
		assertThat(car.getDistance()).isEqualTo("-");
	}

	@Test
	@DisplayName("car random")
	void getRandom() {
		assertThat(car.random()).isBetween(1, 9);
	}
}
