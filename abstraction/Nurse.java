package abstraction;

import implementor.Treatment;

public class Nurse extends MedicalStaff {
		public Nurse(Treatment treatment) {
			super(treatment);
		}
		public void performTreatment() {
			System.out.println("Performing by Nurse:");
			
			getTreatment().treat();
		}
	} 
