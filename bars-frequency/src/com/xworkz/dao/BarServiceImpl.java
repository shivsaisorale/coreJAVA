package com.xworkz.dao;

import com.xworkz.bar.entity.BarEntity;


public class BarServiceImpl implements BarService {

	private BarDAO  dao;
	public BarServiceImpl() 
	{
		super();
		this.dao=dao;
	}

	@Override
	public void validateAndSave(BarEntity entity) {
		if (entity.getName() != null && entity.getName().isEmpty() && entity.getName().length() > 3
				&& entity.getName().length() < 25) {
			
		}
		if (entity.getEmail() != null && entity.getEmail().isEmpty() && entity.getEmail().length() > 3
				&& entity.getEmail().length() < 25) {
			dao.save(entity);
		}
		if (entity.getPhoNum() > 0 && entity.getPhoNum() <= 5000000000d) {
			dao.save(entity);
		}
		if (entity.getLocation() != null && entity.getLocation().isEmpty() && entity.getLocation().length() > 3
				&& entity.getLocation().length() < 25) {
			dao.save(entity);
		}

		if (entity.getOwner() != null && entity.getOwner().isEmpty() && entity.getOwner().length() > 3
				&& entity.getOwner().length() < 25) {
			dao.save(entity);
		}

		if (entity.getNoOfbrands() > 0 && entity.getNoOfbrands() <= 50000) {
			dao.save(entity);
		}

		if (entity.getNoOfcustomer() > 0 && entity.getNoOfcustomer() <= 500000) {
			dao.save(entity);

			if (entity.getCreatedBy() != null && entity.getCreatedBy().isEmpty() && entity.getCreatedBy().length() > 3
					&& entity.getCreatedBy().length() < 25) {
				dao.save(entity);
			}
			if (entity.getCreatedAt() != null) {
				dao.save(entity);
			}

			if (entity.getUpdatedBy() != null && entity.getUpdatedBy().isEmpty() && entity.getUpdatedBy().length() > 3
					&& entity.getUpdatedBy().length() < 25) {
				dao.save(entity);
			}

		}
	}

}
