package view;

public enum OutputMessage {
  ENTER_CAR_NAMES("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
  CAR_RACING_RESULT_HEADER("실행 결과"),
  ENTER_ATTEMPT_COUNT("시도할 회수는 몇회인가요?");

  private final String message;

  OutputMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}