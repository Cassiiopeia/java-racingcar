package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.dto.RaceResultDto;
import model.entity.Car;
import validation.Validation;

public class RacingService {
  private final Random random = new Random();

  // 경주 시작 -> 결과 반환
  public RaceResultDto startRace(String[] carNames, int attemptCount) {
    // Car 객체 생성
    List<Car> cars = createCars(carNames);

    // 모든 Car 랜덤 이동
    for (int i = 0; i < attemptCount; i++) {
        randomMoveCars(cars);
    }

    // Car 결과 반환
    return new RaceResultDto(cars);
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
