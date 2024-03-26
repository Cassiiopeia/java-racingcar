package view;

import static view.OutputMessage.CAR_RACING_RESULT_HEADER;
import static view.OutputMessage.ENTER_ATTEMPT_COUNT;
import static view.OutputMessage.ENTER_CAR_NAMES;

public class OutputView {
  public static void printEnterCarNamesOutputMessage(){
    System.out.println(ENTER_CAR_NAMES);
  }

  public static void printEnterAttemptCountMessage(){
    System.out.println(ENTER_ATTEMPT_COUNT);
  }

  public static void printCarRacingResultHeader(){
    System.out.println(CAR_RACING_RESULT_HEADER);
  }

  public static void printErrorMessage(String message) {
    System.out.println(message);
  }
}
