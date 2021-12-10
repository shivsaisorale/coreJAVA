package com.xworkx.framework.dto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArmyScammer {

	public static void main(String[] args) {

		ArmyDTO armyDTO1 = new ArmyDTO("India", "military", "green", 109875);

		ArmyDTO armyDTO2 = new ArmyDTO("India", "Navy", "white", 70875);

		ArmyDTO armyDTO3 = new ArmyDTO("India", "Air force", "sky blue", 69875);

		ArmyDTO armyDTO4 = new ArmyDTO("US", "navy", "white", 109875);

		Set<ArmyDTO> set = new HashSet<ArmyDTO>();
		set.add(armyDTO2);
		set.add(armyDTO4);
		set.add(armyDTO1);
		set.add(armyDTO3);

		Iterator<ArmyDTO> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
