package abstraction;

import implementor.Treatment;

public abstract class MedicalStaff {
	private final Treatment treatment;

	protected MedicalStaff(Treatment treatment) {
		boolean isValidTreatment = TreatmentChecker.isValidTreatment(this, treatment);
		if(isValidTreatment == false){
			throw new IllegalArgumentException();
		}
		this.treatment = treatment;
	}
	
	public Treatment getTreatment() {
		return treatment;
	}
	
	public abstract void performTreatment();
} 

