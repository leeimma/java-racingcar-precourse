import java.util.Scanner;

public class User {

	private String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private String CAR_RACING_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";

	public static final String CAR_NAME_REGEX = "^([^,]{1,5},)*[^,]{1,5}$";
	public static final String CAR_RACING_COUNT_REGEX = "^[1-9][0-9]*$";

	private static final String CAR_NAME_DELIMITER = ",";
	private static final String CAR_ERROR_MESSAGE = "잘못 입력하셨습니다.";

	public String userInputValue(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextLine();
	}

	public String[] getCarName() {
		String value;
		boolean flag = true;
		do {
			value = userInputValue(CAR_NAME_INPUT_MESSAGE);
			flag = validationCheck(value, CAR_NAME_REGEX);
		} while (flag);
		return setCarNameSplit(value);
	}

	public boolean validationCheck(String value, String regex) {
		if (!value.matches(regex)) {
			System.out.println(CAR_ERROR_MESSAGE);
			return true;
		}
		return false;
	}

	public String[] setCarNameSplit(String carNames) {
		return carNames.split(CAR_NAME_DELIMITER);
	}

	public int getRacingCount() {
		String value;
		boolean flag = true;
		do {
			value = userInputValue(CAR_RACING_COUNT_MESSAGE);
			flag = validationCheck(value, CAR_RACING_COUNT_REGEX);
		} while (flag);
		return Integer.valueOf(value);
	}

}
