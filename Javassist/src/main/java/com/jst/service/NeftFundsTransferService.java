package com.jst.service;

public class NeftFundsTransferService implements FundsTransferService {

	@Override
	public String transfer(String fromAc, String toAc, float amount, String comments) {
		System.out.println("NEFT Transfer");
		return "neft-362521";
	}
}
