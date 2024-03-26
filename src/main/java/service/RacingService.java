package service;

import java.util.ArrayList;
import java.util.List;
import model.entity.Car;

public class RacingService {

  public void startRace(String[] carNameStrings, int attemptCount) {
    // Car 객체 생성
    List<Car> cars = new ArrayList<>();

    for(String carNameString : carNameStrings){
      cars.add(new Car(carNameString));


    }

    // Car 랜덤 이동 반복 + 출력

    // 결과 출력
  }

}
