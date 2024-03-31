package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.entity.Car;
import validation.Validation;

public class RacingService {
  private final Random random = new Random();

  // 경주 시작 -> 각 시도 후 자동차 리스트 반환
  public List<List<Car>> startRace(String[] carNames, int attemptCount) {
    // Car 객체 생성
    List<Car> cars = createCars(carNames);

    // 각각 랜덤이동 결과 저장
    List<List<Car>> raceResults = new ArrayList<>();

    // 모든 Car 랜덤이동 후 결과 저장
    for (int i = 0; i < attemptCount; i++) {
        randomMoveCars(cars);
        raceResults.add(new ArrayList<>(cars));
    }

    // 각각 랜덤이동 결과 List 반환
    return raceResults;
  }

  private List<Car> createCars(String[] carNames){
    List<Car> cars = new ArrayList<>();
    for(String carName : carNames){
      cars.add(new Car(carName));
    }
    return cars;
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

}
