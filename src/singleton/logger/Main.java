package singleton.logger;

public class Main {
    public static void main(String[] args) {
        Logger loggerInstance = Logger.getLoggerInstance();
        System.out.println(loggerInstance.hashCode());
        Logger loggerInstance1 = Logger.getLoggerInstance();
        System.out.println(loggerInstance1.hashCode());

    }
}
