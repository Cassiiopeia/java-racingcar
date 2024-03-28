package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.entity.Car;
import validation.Validation;
import view.OutputView;

public class RacingService {
  private final Random random = new Random();

  public void startRace(String[] carNameStrings, int attemptCount) {
    // Car 객체 생성
    List<Car> cars = createCars(carNameStrings);

    // 레이스 시작
    // Car 랜덤 이동 반복 + 출력
    createRacingAttemptAndPrint(cars, attemptCount);

    // 우승자 선별
    List<Car> winnerCars = findWinners(cars);

    // 우승자 결과 출력
    OutputView.printWinners(winnerCars);
  }

  private List<Car> createCars(String[] carNames){
    List<Car> cars = new ArrayList<>();
    for(String carName : carNames){
      cars.add(new Car(carName));
    }
    return cars;
  }

  private void createRacingAttemptAndPrint(List<Car> cars, int attemptCount){
    for(int i = 0 ; i < attemptCount ; i++){
      randomMoveCars(cars);
      OutputView.printRaceResult(cars);
    }
  }

  private void randomMoveCars(List<Car> cars){
    for(Car car : cars){
      int randomInt = random.nextInt(10); // 0~9
      Validation.validRandomValue(randomInt);
      if(randomInt >= 4){
        car.moveDistance(randomInt);
      }
    }
  }

  private List<Car> findWinners(List<Car> cars){
    List<Car> winners = new ArrayList<>();
    int maxDistance = getMaxDistance(cars);
    for(Car car: cars){
      if(car.getMovedDistance() == maxDistance){
        winners.add(car);
      }
    }
    return winners;
  }

  private int getMaxDistance(List<Car> cars){
    int maxDistance = 0;
    for(Car car: cars){
      maxDistance = Math.max(maxDistance, car.getMovedDistance());
    }
    return maxDistance;
  }

}
