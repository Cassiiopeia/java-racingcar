import controller.RacingController;
import service.RacingService;

public class RacingMain {

    public static void main(String[] args) {
        RacingService racingService = new RacingService();
        RacingController racingController = new RacingController(racingService);

        // 경주 게임 시작
        racingController.runRacingSystem();
    }
}
