package com.xworkz.dp;

import com.xworkz.dp.dto.BusDriver;
import com.xworkz.dp.dto.ElevatorDTO;

public class ElevatorStarter {

	public static void main(String[] args) {
		
		ElevatorDTO elevatorDTO = new ElevatorDTO();
		elevatorDTO.setCompany("HP");
		elevatorDTO.setNoOfpeople("23");
		elevatorDTO.setFlore(32);
		elevatorDTO.setMaxWaight(44.5F);
		
				
		ElevatorDTO eliDto1=new ElevatorDTO("hitachi3", "13", 8, 1200);
		ElevatorDTO eliDto2=new ElevatorDTO("kone","23",4,455.5f);
		ElevatorDTO eliDto3=new ElevatorDTO("hitachi","3",3,344.f);
		ElevatorDTO eliDto4=new ElevatorDTO("schindler elevators","3",12,3445.4f);
		
	 
		ElevatorDTO[] elevators =new ElevatorDTO[8];
		elevators[0] =elevatorDTO;
		elevators[1] =eliDto2;
		elevators[2] =eliDto3;
		elevators[3] =eliDto4;
		elevators[4] =eliDto3;
		elevators[5] =eliDto4;
		for (int j =0; j < elevators.length;j++) {
			
			ElevatorDTO ref = elevators[j];
			if( ref !=null) {
			System.out.println("Elevator company : ".concat(ref.getCompany()));
			System.out.println("max no of people:".concat(ref.getNoOfpeople()));
			System.out.println("flore:".concat(String.valueOf(ref.getFlore())));
			System.out.println("maxWaight : ".concat(String.valueOf(ref.getMaxWaight())));
			System.out.println("------------------------");
			} else {
			System.out.println(String.valueOf(j).concat("nd index is pointing to null"));
		}

		}



	}

}
