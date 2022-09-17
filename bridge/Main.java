package bridge;

import abstraction.Nurse;
import abstraction.Surgeon;
import implementor.Injection;
import implementor.Operation;

public class Main {
    public static void main(String args[]) {

    Operation operation = new Operation();
	Injection injection = new Injection();

	new Surgeon(operation).performTreatment();
	new Nurse(injection).performTreatment();

	Surgeon sur = new Surgeon(injection);
	// exception will be raised, surgeon is not permitted to perform injections
	sur.performTreatment();
    }
}
 