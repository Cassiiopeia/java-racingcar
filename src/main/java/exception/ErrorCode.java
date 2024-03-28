package exception;

public enum ErrorCode {
  EXAMPLE_ERROR_MESSAGE("예시 에러 메시지 입니다."),
  INVALID_CAR_NAME_LENGTH("이름 길이는 1~5자여야합니다."),
  INVALID_RANDOM_VALUE("랜던값은 0~9 인 숫자여야합니다."),
  INVALID_ATTEMPT_COUNT_INPUT("");
  private static final String ERROR_HEADER = "[ERROR] : ";
  private final String message;

  ErrorCode(String message) {
    this.message = message;
  }
  public  String getMessage(){
    return ERROR_HEADER + this.message;
  }
}
