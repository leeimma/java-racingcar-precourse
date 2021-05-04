public class Message {

	public static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String CAR_RACING_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";

	public static final String CAR_NAME_REGEX = "^([^,]{1,5},)*[^,]{1,5}$";
	public static final String CAR_RACING_COUNT_REGEX = "^[1-9][0-9]*$";

	public static final String CAR_NAME_DELIMITER = ",";
	public static final String CAR_ERROR_MESSAGE = "잘못 입력하셨습니다.";

	public static final String GAME_START_MESSAGE = "실행결과";
	public static final String GAME_END_MESSAGE = "가 최종 우승했습니다.";

}
