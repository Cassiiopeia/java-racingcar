package validation;

import exception.ErrorCode;
import exception.RacingCarException;

public class Validation {

  // Car 이름 5자 이상 제한 검증
  public static void validCarNames(String[] carNames) {
    for (String carName : carNames) {
      if (!isShortOrEqualFiveAndNotEmptyString(carName)) {
        throw new RacingCarException(ErrorCode.INVALID_CAR_NAME_LENGTH);
      }
    }
  }

  // 시도횟수 양수 정수인지 검사
  public static void validAttemptCountInput(String attemptCount) {
    try {
      Integer.parseInt(attemptCount);
    } catch (Exception e) {
      throw new RacingCarException(ErrorCode.INVALID_ATTEMPT_COUNT_INPUT);
    }
  }

  // 랜덤 숫자 검증
  public static void validRandomValue(int randomInt) {
    if (!(randomInt >= 0 && randomInt <= 9)) {
      throw new RacingCarException(ErrorCode.INVALID_RANDOM_VALUE);
    }
  }
  private static boolean isShortOrEqualFiveAndNotEmptyString(String string) {
    return string.length() <= 5 && !string.isEmpty();
  }
}