package com.xworkz.ipl.service;

import java.time.LocalDateTime;

import com.xworkz.ipl.entity.IplEntity;
import com.xworkz.ipl.repo.IplRepository;

public class IplServiceImpl implements IplService {

	private IplRepository iplRepository;

	public IplServiceImpl(IplRepository iplRepository) {
		this.iplRepository = iplRepository;

	}

	@Override
	public boolean validatendsave(IplEntity entity) {
		boolean valid = false;
		if (entity.getTeamName() != null && !(entity.getTeamName().length() < 5)
				&& !(entity.getTeamName().length() > 15)) {
			valid = true;
		} else {
			valid = false;
			System.out.println("invalid teamname");

		}
		if (entity.getOwner() != null && !(entity.getOwner().length() < 6) && !(entity.getOwner().length() > 18)) {
			valid = true;
		} else {
			valid = false;
			System.out.println("invalid owner");

		}
		if (entity.getCaptain() != null
				&& !(entity.getCaptain().length() < 8 && !(entity.getCaptain().length() > 17))) {
			valid = true;
		} else {
			valid = false;
			System.out.println("invalide captine");
		}
		if (entity.getSponsor() != null
				&& !(entity.getSponsor().length() < 4 && !(entity.getSponsor().length() > 30))) {
			valid = true;
		} else {
			valid = false;
			System.out.println("invalid sponsor");

		}
		LocalDateTime today = LocalDateTime.now();
		if (entity.getEstDate() != null && entity.getEstDate().isBefore(today)) {
			valid = true;
		} else {
			valid = false;
			System.out.println("invlide estdate");
		}

		if (entity.getBudget() != null && !(entity.getBudget().length() > 100000)
				&& (entity.getBudget().length() < 500000)) {
			valid = true;
		} else {
			valid = false;
			System.out.println("invalid budget");

		}
		if (valid) {
			iplRepository.save(entity);
		}
		return valid;
	}

}
