package com.xworkz.Hospital;

public class HospitalAssocation {
      
	public String name;
	
	
	
	private HospitalAdmitRule admitRule;

	private HospitalDischargeRule dischange;

	public HospitalAssocation() {
		System.out.println("**invoked method no-args const**");
	}

	public HospitalAssocation( String name,HospitalAdmitRule admitRule, HospitalDischargeRule dischange) {
		super();
		this.name=name;
		this.admitRule = admitRule;
		this.dischange = dischange;
	}

	public void pesentDetails() {
		if (admitRule != null) {
			System.out.println("Pesent Condition is very bad plz Admit ");
			String pesentReg = this.admitRule.register();
			double AdavancePay = this.admitRule.payAdvance();
			boolean insurance = this.admitRule.validInsurance();
			if (pesentReg != null) {
				System.out.println("*Pesent register :".concat(name));

			} else {
				System.err.println("Pesent did not register....");
			}
			if (insurance) {
				System.out.println("Pesent has Insurance");
			} else {
				System.err.println("Pesent did not have Insurance");
			}
			if (AdavancePay >= 1000) {
				System.out.println("if dont have insurance and he have pay Adavance for them");
			} else {
				System.err.println("Otherwise donot pay");
			}
		} else {
			System.err.println("Pesent Good No Problem");
		}

	}
	
	public void  pesentdischangeDetails() {
		if(dischange!=null) {
			System.out.println("Pesent Discharge Details__________");
			 double discountAmount=this.dischange.discount();
			 if(discountAmount<=1000) {
				 System.out.println("Hospital give discount to him///");
				 
			 }else {
				 System.err.println("Hospital did not give any discount to him");
			 }
			 
			  boolean totalAmount=this.dischange.payBill();
			  if(totalAmount) {
				  System.out.println("Pesent payed total Amount Hospital:".concat(String.valueOf(2000f)));
			  }else {
				  System.err.println("Pesent did not payed total amount to Hospital and he died");
			  }
		}else {
			System.err.println("Pesent not Discharge****");
		}
	
}
}
