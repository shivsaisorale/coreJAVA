package service;

import register.entity.RegisterEntity;

public interface RegisterService {

	boolean validateAndSave (RegisterEntity entity);
}
