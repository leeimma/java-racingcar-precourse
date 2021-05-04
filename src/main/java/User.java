import java.util.Scanner;

public class User {

	public String userInputValue(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextLine();
	}

	public String[] getCarName() {
		String value;
		boolean flag = true;
		do {
			value = userInputValue(Message.CAR_NAME_INPUT_MESSAGE);
			flag = validationCheck(value, Message.CAR_NAME_REGEX);
		} while (flag);
		return setCarNameSplit(value);
	}

	public boolean validationCheck(String value, String regex) {
		if (!value.matches(regex)) {
			System.out.println(Message.CAR_ERROR_MESSAGE);
			return true;
		}
		return false;
	}

	public String[] setCarNameSplit(String carNames) {
		return carNames.split(Message.CAR_NAME_DELIMITER);
	}

	public int getRacingCount() {
		String value;
		boolean flag = true;
		do {
			value = userInputValue(Message.CAR_RACING_COUNT_MESSAGE);
			flag = validationCheck(value, Message.CAR_RACING_COUNT_REGEX);
		} while (flag);
		return Integer.valueOf(value);
	}

}
