package abstraction;

import implementor.Treatment;

public class TreatmentChecker {
    public static boolean isValidTreatment(MedicalStaff staff, Treatment treatment) {
        return TreatmentMapper.getAllowedTreatment(staff).contains(treatment.getClass());
    }
}
