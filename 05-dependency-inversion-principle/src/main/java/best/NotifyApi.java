package best;

import log.LoggerService;
import log.LoggerServiceImpl;

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
