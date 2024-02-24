package ComplexNumberCalculator.service;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LOGGER implements Loggerable{
    public final static Logger logger =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    static {
        try (FileInputStream in =
                     new FileInputStream("C:\\Dev\\Java\\OOP\\HomeWork\\HomeWork\\src\\main\\java\\org\\home_work7\\resources\\logging.properties")) {
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(String message) {
        logger.info(message);
    }

}
