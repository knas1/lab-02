package sa.edu.kau.fcit.cpit252;

import org.junit.jupiter.api.Test;
import sa.edu.kau.fcit.cpit252.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {

    @Test
    public void shouldBeIdenticals()
    {
        Logger log1 = Logger.getLoggerInstance();
        Logger log2 = Logger.getLoggerInstance();
        assertEquals(log1, log2);
    }
}
