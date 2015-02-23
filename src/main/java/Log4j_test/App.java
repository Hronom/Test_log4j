package Log4j_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();

        InfoProcessor infoProcessor = new InfoProcessor();
        infoProcessor.run("Hello World!");
    }
}
