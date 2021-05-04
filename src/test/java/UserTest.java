import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
	User user;

	@BeforeEach
	void setUp() {
		user = new User();
	}

	@Test
	@DisplayName("사용자 입력 체크")
	void validationCheck() {
		// 자동차 이름 체크
		assertThat(user.validationCheck("name1,name2", user.CAR_NAME_REGEX)).isFalse();
		assertThat(user.validationCheck("name1,nameError2", user.CAR_NAME_REGEX)).isTrue();
		// 횟수 체크
		assertThat(user.validationCheck("123", user.CAR_RACING_COUNT_REGEX)).isFalse();
		assertThat(user.validationCheck("1we3", user.CAR_RACING_COUNT_REGEX)).isTrue();
	}

	@Test
	@DisplayName("자동차 이름 분할")
	void setCarNameSplit() {
		assertThat(user.setCarNameSplit("asd,qwer")).contains("asd", "qwer");
	}

}
