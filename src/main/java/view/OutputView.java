package view;

import static view.OutputMessage.CAR_RACING_RESULT_HEADER;
import static view.OutputMessage.ENTER_ATTEMPT_COUNT;
import static view.OutputMessage.ENTER_CAR_NAMES;

import java.util.List;
import model.entity.Car;

public class OutputView {
  public static void printEnterCarNamesOutputMessage(){
    System.out.println(ENTER_CAR_NAMES.getMessage());
  }

  public static void printEnterAttemptCountMessage(){
    System.out.println(ENTER_ATTEMPT_COUNT.getMessage());
  }

  public static void printCarRacingResultHeader(){
    System.out.println();
    System.out.println(CAR_RACING_RESULT_HEADER.getMessage());
  }

  public static void printErrorMessage(String message) {
    System.out.println(message);
  }

  // 각 시도의 결과를 출력하는 메소드
  public static void printRaceResult(List<Car> cars) {
    for (Car car : cars) {
      System.out.println(car.getCarName() + " :" + "-".repeat(car.getMovedDistance()));
    }
    System.out.println();
  }

  public static void printWinners(List<String> winners) {
    String winnerNames = String.join(", ", winners);
    System.out.println(winnerNames + "가 최종 우승했습니다.");
  }
}
