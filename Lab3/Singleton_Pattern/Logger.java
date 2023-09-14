import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
class Logger {
    private static Logger instance;
    private PrintWriter writer;

    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        writer.println(message);
        writer.flush();
    }
    public void close(){
        writer.close();
    }
}
