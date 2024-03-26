package controller;

import exception.RacingCarException;
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
    // TODO : 자동차 경주 시스템 로직
    OutputView.printEnterCarNamesOutputMessage();
    String[] carNames = InputView.getCarNamesInput();
    Validation.validCarNames(carNames);

    OutputView.printEnterAttemptCountMessage();
    String attemptCountInput = InputView.getAttemptCountInput();
    Validation.validAttemptCountInput(attemptCountInput);
    int attemptCount = Integer.parseInt(attemptCountInput);

    racingService.startRace(carNames, attemptCount);
  }
}
