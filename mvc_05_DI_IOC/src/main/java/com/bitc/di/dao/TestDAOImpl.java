package com.bitc.di.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl implements TestDAO {

	@Override
	public void select(String message) {
		System.out.println("TestDAOImpl select : " + message);
	}

}
