package best;

public class NotifyApi {

    private LoggerService loggerService;

    public NotifyApi() {
        this.loggerService = new LoggerServiceImpl();
    }

    public void notify(String message) {
        // notify
        this.loggerService.logService(message);
    }
}
