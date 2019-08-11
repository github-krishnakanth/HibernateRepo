package com.jst.service;

public class RTGSFundsTransferService implements FundsTransferService {

	@Override
	public String transfer(String fromAc, String toAc, float amount, String comments) {
		System.out.println("RTGS Transfer");
		return "rtgs-523624";
	}
}
