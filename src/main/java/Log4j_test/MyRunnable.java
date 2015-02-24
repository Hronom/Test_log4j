package Log4j_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MyRunnable implements Runnable {
    private final Logger logger;

    public MyRunnable() {
        //DOMConfigurator.configure(this.getClass().getClassLoader().getResource(LOG4J_FILEPATH));
        logger = LogManager.getLogger();
    }

    public void run() {
        logger.info("Important job running in MyRunnable" + Thread.currentThread().getName());
    }
}
