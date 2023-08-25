package best;

import log.DateLogger;
import log.Logger;
import log.NormalLogger;

public class LoggerServiceImpl implements LoggerService {

    private Logger logger = new NormalLogger();
    //private Logger logger = new DateLogger();

    @Override
    public void logService(String message) {
        this.logger.log(message);
    }

}
