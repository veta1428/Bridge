package abstraction;

import implementor.Treatment;

public class Surgeon extends MedicalStaff {
		public Surgeon(Treatment treatment) {
			super(treatment);
		}
		public void performTreatment() {
			System.out.println("Performing by Surgeon:");
			getTreatment().treat();
		}
	}
