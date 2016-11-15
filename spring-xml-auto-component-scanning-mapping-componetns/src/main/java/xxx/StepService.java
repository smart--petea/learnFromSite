package xxx;

import xxx.StepInventory;

public class StepService {
    private StepInventory stepInventory;

    public String retrieveStep() {
        return stepInventory.retrieveStep();
    }

    public void setStepInventory(StepInventory stepInventory) {
        this.stepInventory = stepInventory;
    }
}
