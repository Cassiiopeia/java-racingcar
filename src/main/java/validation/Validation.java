package validation;

import exception.ErrorCode;
import exception.RacingCarException;

public class Validation {

  public static void validCarNames(String[] carNames) {
    for (String carName : carNames) {
      if (!isShortOrEqualFiveAndNotEmptyString(carName)) {
        throw new RacingCarException(ErrorCode.INVALID_CAR_NAME_LENGTH);
      }
    }
  }

  public static void validAttemptCountInput(String attemptCount) {
    try {
      Integer.parseInt(attemptCount);
    } catch (Exception e) {
      throw new RacingCarException(ErrorCode.INVALID_ATTEMPT_COUNT_INPUT);
    }
  }

  // Car 이름 5자 이상 제한 검증
  public static boolean isShortOrEqualFiveAndNotEmptyString(String string) {
    return string.length() <= 5 && !string.isEmpty();
  }

  // 랜덤 숫자 검증
  public static void validRandomValue(int randomInt) {
    if (!(randomInt > 0 && randomInt < 9)) {
      throw new RacingCarException(ErrorCode.INVALID_RANDOM_VALUE);
    }
  }
}