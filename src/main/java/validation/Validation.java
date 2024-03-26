package validation;

import exception.ErrorCode;
import exception.RacingCarException;

public class Validation {
  public static void validCarNames(String[] carNames){
    for(String carName : carNames){
      if(!isShortOrEqualFiveAndNotEmptyString(carName)){
        throw new RacingCarException(ErrorCode.INVALID_CAR_NAME_LENGTH);
      }
    }
  }

  public static void validAttemptCountInput(String attemptCount){
    try {
      Integer.parseInt(attemptCount);
    }catch (Exception e){
      throw new RacingCarException(ErrorCode.INVALID_ATTEMPT_COUNT_INPUT);
    }
  }

  // 5자 이상 제한
  public static boolean isShortOrEqualFiveAndNotEmptyString(String string){
    return string.length()<=5 && !string.isEmpty();
  }
}