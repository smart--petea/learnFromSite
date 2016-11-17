package xxx;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class StepService {
    private static @Log Logger LOG;

    public void step(int steps) {
        LOG.info("executing " + steps + " steps.");
    }
}
