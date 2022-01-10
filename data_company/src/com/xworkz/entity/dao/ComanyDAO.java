package com.xworkz.entity.dao;

import com.xworkz.entity.ComapanyEntity;

public interface ComanyDAO {

	public void create(ComapanyEntity entity);

	public ComapanyEntity getById(int Id);

	default void update(String newcompany, int id) {
		return;

	}

	default void delete(int id) {

	}

}
