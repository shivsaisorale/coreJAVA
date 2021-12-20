package com.xworkx.framework.collection.dao;

@FunctionalInterface
public interface Search {

	public boolean expression(String operation, String value);

}
