package com.jst.service;

public interface FundsTransferService {
	String transfer(String fromAc, String toAc, float amount, String comments);
}
