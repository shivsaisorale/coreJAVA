package com.xworkz.hostel.name.city;

import com.xworkz.hostel.name.IndianCitizen;
import com.xworkz.hostel.name.MarriageRule;
import com.xworkz.hostel.name.TrafficRule;
import com.xworkz.hostel.name.VotingRule;

public class AfricanCitizenScammer {

	public static void main(String[] args) {
		
		Object object = new IndianCitizen();
		System.out.println(object.toString());
		
		if(object instanceof IndianCitizen) {
			IndianCitizen casted=(IndianCitizen)object;
			
			
			System.out.println(casted.votingAge());
			System.out.println(casted.validId());
			
			System.out.println(casted.validlicenseNo());
			System.out.println(casted.licence());
			
		}
	IndianCitizen indianCitizen =new IndianCitizen();
	System.out.println(indianCitizen.votingAge());
	System.out.println(indianCitizen.validId());
	System.out.println(indianCitizen.validlicenseNo());
	System.out.println(indianCitizen.licence());

	VotingRule voterule =new IndianCitizen();
	System.out.println(voterule.votingAge());
	System.out.println(voterule.validId());
	
	TrafficRule trafficRule= new IndianCitizen();
	trafficRule.validInsurance();
	trafficRule.validlicenseNo();
	MarriageRule marry=new IndianCitizen();
	marry.validAge('f', 21);
	
	}
	}


