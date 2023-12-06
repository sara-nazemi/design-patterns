package log;

public class LoggerServiceImpl implements LoggerService {

    private Logger logger;

    public LoggerServiceImpl() {
        this.logger = new DateLogger();
    }

    @Override
    public void logService(String message) {
        this.logger.log(message);
    }

}
