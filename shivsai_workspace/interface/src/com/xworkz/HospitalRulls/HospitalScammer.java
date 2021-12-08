package com.xworkz.HospitalRulls;

import com.xworkz.Hospital.Hospital;
import com.xworkz.Hospital.HospitalAdmitRule;
import com.xworkz.Hospital.HospitalAssocation;
import com.xworkz.Hospital.HospitalDischargeRule;

public class HospitalScammer {

	public static void main(String[] args) {

		HospitalAdmitRule admit = new Hospital();

		HospitalDischargeRule discharge = new Hospital();

		HospitalAssocation hsptl = new HospitalAssocation("LUCKY", admit, discharge);

		hsptl.pesentDetails();

		hsptl.pesentdischangeDetails();

	}
}
