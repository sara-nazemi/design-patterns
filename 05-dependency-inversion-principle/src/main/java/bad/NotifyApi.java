package bad;

import log.Logger;
import log.NormalLogger;

public class NotifyApi {

    private Logger Logger;

    public NotifyApi() {
        // we call directly normal logger
        // if we want to change DateLogger
        // we must to change it

        // then it has coupling
        this.Logger = new NormalLogger();
    }

    public void notify(String message) {
        // notify
        this.Logger.log(message);
    }
}
