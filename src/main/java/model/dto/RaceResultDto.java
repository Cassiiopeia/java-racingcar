package model.dto;

import java.util.ArrayList;
import java.util.List;
import model.entity.Car;

public class RaceResultDto {
  private List<Car> cars;
  private List<String> winnerNames;

  public RaceResultDto(List<Car> cars){
    this.cars = cars;
    this.winnerNames = findWinners(cars);
  }

  public List<Car> getCars() {
    return cars;
  }

  public List<String> getWinnerNames() {
    return winnerNames;
  }

  // 우승자 찾기 로직
  private List<String> findWinners(List<Car> cars){
    List<String> winners = new ArrayList<>();
    int maxDistance = getMaxDistance(cars);
    for(Car car: cars){
      if(car.getMovedDistance() == maxDistance){
        winners.add(car.getCarName());
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
