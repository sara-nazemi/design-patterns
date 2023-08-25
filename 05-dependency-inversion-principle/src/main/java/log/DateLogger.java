package log;

import java.util.Date;

public class DateLogger extends Logger {

    @Override
    public void log(String message) {
        System.out.println(new Date().toString() + " - " + message);
    }
}
