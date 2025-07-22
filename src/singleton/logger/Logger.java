package singleton.logger;

public class Logger {
    private static Logger loggerInstance;

    private Logger() {
    }

    public static Logger getLoggerInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }
    public void log(String message){
        System.out.println("LOG :: "+message);

    }
}
