package controller;

import model.dto.RaceResultDto;
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
    // 사용자 입력
    OutputView.printEnterCarNamesOutputMessage();
    String[] carNames = InputView.getCarNamesInput();
    Validation.validCarNames(carNames);

    OutputView.printEnterAttemptCountMessage();
    String attemptCountInput = InputView.getAttemptCountInput();
    Validation.validAttemptCountInput(attemptCountInput);
    int attemptCount = Integer.parseInt(attemptCountInput);

    // 결과 반환 Dto
    RaceResultDto raceResultDto = racingService.startRace(carNames, attemptCount);

    // OutputView 결과 전달 출력
    OutputView.printRaceResult(raceResultDto);
  }
}
