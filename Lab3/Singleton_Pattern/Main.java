public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started");
        logger.log("Error 404");
        logger.close();;
    }
}