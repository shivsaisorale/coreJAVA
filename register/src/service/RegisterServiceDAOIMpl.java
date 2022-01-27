package service;

import register.dao.RegisterDAO;
import register.entity.RegisterEntity;

public class RegisterServiceDAOIMpl implements RegisterService {

	private RegisterDAO dao;

	public RegisterServiceDAOIMpl(RegisterDAO dao) {
		super();
		this.dao = dao;
	}

	@Override

	public boolean validateAndSave(RegisterEntity entity) {
		boolean valid = false;
		if (entity.getUsername() != null && !(entity.getUsername().isEmpty()) && !(entity.getUsername().length() < 6)
				&& !(entity.getUsername().length() > 25)) {
			valid = true;
		} else {
			System.out.println("invalid name");
			valid = false;
			return valid;
		}

		if (entity.getEmail() != null &&!( entity.getEmail().isEmpty() )&& !(entity.getEmail().length() < 3)
				&& !(entity.getEmail().length() > 25)) {
			valid = true;

		} else {
			System.out.println("invalid mail");
			valid = false;
			return valid;
		}
		if (entity.getPassword() != null && !(entity.getPassword().isEmpty()) && !(entity.getPassword().length() < 8)
				&& !(entity.getEmail().length() > 36)) {
			valid = true;

		} else {
			System.out.println("invalid password");
			valid = false;
		}

		if (String.valueOf(entity.getMobileno()).length() == 10) {
			valid = true;

		} else {
			System.out.println("invalid mobleno");
			valid = false;
			return valid;
		}
		if (entity.getCity() != null && !(entity.getCity().isEmpty()) && !(entity.getCity().length() < 3)
				&& !(entity.getCity().length() > 56)) {
			valid = true;

		} else {
			System.out.println("invalid city");
			valid = false;
			return valid;
		}
		if (entity.getCountry() != null && !(entity.getCountry().isEmpty() )&& !(entity.getCountry().length() < 3)
				&& !(entity.getCountry().length() > 56)) {
			valid = true;

		} else {
			System.out.println("invalid country");
			valid = false;
			return valid;
		}
		if (valid) {
			dao.save(entity);
		}
		return valid;
	}

}
