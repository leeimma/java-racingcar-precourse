import java.util.List;

public class Racing {

	public void game(String[] carNames, int game) {
		RacingCar cars = new RacingCar(carNames);
		System.out.println(Message.GAME_START_MESSAGE);
		for (int i = 1; i <= game; i++) {
			RacingRelay(cars.getCars());
		}
		System.out.println(cars.getRacingWinner() + Message.GAME_END_MESSAGE);
	}

	public void RacingRelay(List<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			Car car = cars.get(i);
			car.racingCar();
			System.out.println(car.getName() + " : " + car.getDistance());
		}
	}

	public static void main(String[] args) {
		User user = new User();
		Racing racing = new Racing();
		racing.game(user.getCarName(), user.getRacingCount());
	}
}
