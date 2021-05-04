import java.util.List;

public class Racing {

	private static final String GAME_START_MESSAGE = "실행결과";
	private static final String GAME_END_MESSAGE = "가 최종 우승했습니다.";

	public void game(String[] carNames, int game) {
		RacingCar cars = new RacingCar(carNames);
		System.out.println(GAME_START_MESSAGE);
		for (int i = 1; i <= game; i++) {
			RacingRelay(cars.getCars());
		}
		System.out.println(cars.getRacingWinner() + GAME_END_MESSAGE);
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
