package log;

public class NormalLogger extends Logger {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
