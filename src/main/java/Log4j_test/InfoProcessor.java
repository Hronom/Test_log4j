package Log4j_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InfoProcessor {
    private final Logger logger;

    public InfoProcessor() {
        logger = LogManager.getLogger();
    }

    public void run(String str) {
        logger.entry(str);

        logger.debug("I'm doing science and I'm still alive.");
        logger.info("I feel fantastic and I'm still alive.");
        logger.warn("While you're dying I'll be still alive.");
        logger.error("And when you're dead I will be, still alive.");
        logger.fatal("Still alive, still alive.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.exit();
    }
}
