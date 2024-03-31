package controller;

import java.util.List;
import model.dto.RaceResultDto;
import model.entity.Car;
import service.RacingService;
import validation.Validation;
import view.InputView;
import view.OutputView;

public class RacingController {

  public final RacingService racingService;

  public RacingController(RacingService racingService) {
    this.racingService = racingService;
  }

  public void runRacingSystem() {
    // 사용자 입력 처리
    String[] carNames = getCarNames();
    int attemptCount = getAttemptCount();

    // 경주 진행 및 각 시도 결과 출력
    OutputView.printCarRacingResultHeader();
    List<List<Car>> eachRaceResults = racingService.startRace(carNames, attemptCount);
    eachRaceResults.forEach(OutputView::printRaceResult);

    // 최종 우승자 계산 및 출력
    printWinners(eachRaceResults.get(eachRaceResults.size() - 1));
  }

  private String[] getCarNames() {
    OutputView.printEnterCarNamesOutputMessage();
    String[] carNames = InputView.getCarNamesInput();
    Validation.validCarNames(carNames);
    return carNames;
  }

  private int getAttemptCount() {
    OutputView.printEnterAttemptCountMessage();
    String attemptCountInput = InputView.getAttemptCountInput();
    Validation.validAttemptCountInput(attemptCountInput);
    return Integer.parseInt(attemptCountInput);
  }

  private void printWinners(List<Car> finalCars) {
    RaceResultDto raceResultDto = new RaceResultDto(finalCars);
    OutputView.printWinners(raceResultDto.getWinnerNames());
  }
}
