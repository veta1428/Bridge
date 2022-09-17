package abstraction;

import java.util.ArrayList;

import implementor.Injection;
import implementor.Operation;

public class TreatmentMapper {
    public static ArrayList<Class> getAllowedTreatment(MedicalStaff staff) {
        ArrayList<Class> allowed = new ArrayList<Class>();
        if(staff.getClass() == Surgeon.class){
            // can add new Treatment derived classes further
            allowed.add(Operation.class);
            return allowed;
        } else if (staff.getClass() == Nurse.class) {
            // can add new Treatment derived classes further
            allowed.add(Injection.class);
            return allowed;
        }
        // let your colleague know something is wrong
        throw new IllegalArgumentException();
    }
}
