package controller;

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
