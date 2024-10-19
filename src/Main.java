public class Main {
    public static void main(String[] args) {
        System.out.println("Logger");

        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.INFO, "This is just info." );
        logger.log(LogProcessor.DEBUG, "Debug the code.");
        logger.log(LogProcessor.ERROR, "There is a Run Time Error");
    }
}