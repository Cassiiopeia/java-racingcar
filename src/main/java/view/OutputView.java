package view;

import static view.OutputMessage.CAR_RACING_RESULT_HEADER;
import static view.OutputMessage.ENTER_ATTEMPT_COUNT;
import static view.OutputMessage.ENTER_CAR_NAMES;

import java.util.List;
import model.entity.Car;

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

  public static void printRaceResult(List<Car> cars) {
    printCarRacingResultHeader();
    for (Car car : cars) {
      System.out.println(car.getCarName() + " : " + "-".repeat(car.getMovedDistance()));
    }
    System.out.println();
  }

  public static void printWinners(List<Car> winners){
    String winnerNames = winners.stream()
        .map(Car::getCarName)
        .reduce((name1, name2) -> name1 + ", " + name2)
        .orElse("");
    System.out.println(winnerNames + "가 최종 우승했습니다.");
  }
}
