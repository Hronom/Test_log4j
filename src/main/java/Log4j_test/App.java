package Log4j_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        logger.info("App start");

        InfoProcessor infoProcessor = new InfoProcessor();
        infoProcessor.run("Hello World!");

        Thread[] worker = new Thread[3];
        MyRunnable r = new MyRunnable();

        for (int i = 0; i < 3; i++) {
            worker[i] = new Thread(r);
            worker[i].start();
        }

        logger.info("App stop");
    }
}
