import java.util.ArrayList;
import java.util.List;

public class RacingCar {

	private List<Car> cars = new ArrayList<Car>();

	public RacingCar(String[] carNames) {
		for (int i = 0; i < carNames.length; i++) {
			Car car = new Car(carNames[i]);
			this.cars.add(car);
		}
	}

	public int getRacingMaxDistance() {
		int max = 0;
		for (Car car : cars) {
			max = Math.max(max, car.getDistance().length());
		}
		return max;
	}

	public String getRacingWinner() {
		String result = "";
		int max = getRacingMaxDistance();
		for (Car car : cars) {
			result += car.getDistance().length() == max ? "," + car.getName() : "";
		}
		return result.substring(1);
	}

	public List<Car> getCars() {
		return cars;
	}
}
