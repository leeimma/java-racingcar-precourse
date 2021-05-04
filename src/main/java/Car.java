import java.util.Random;

public class Car {

	private String name;
	private int distance = 0;

	private static final int MOVE_NUM = 4;
	private static final int MOVE_MAX_NUM = 9;
	private static final int MOVE_MIN_NUM = 1;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getDistance() {
		String result = "";
		for (int i = 0; i < this.distance; i++) {
			result += "-";
		}
		return result;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void racing(int random) {
		if (random >= MOVE_NUM) {
			this.distance++;
		}
	}

	public int random() {
		return new Random().nextInt(MOVE_MAX_NUM) + MOVE_MIN_NUM;
	}

	public void racingCar() {
		racing(random());
	}
}
