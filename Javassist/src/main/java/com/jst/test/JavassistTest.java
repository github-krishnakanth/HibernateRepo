package com.jst.test;

import java.lang.reflect.Proxy;

import com.jst.handler.OTPFundsTransferHandler;
import com.jst.service.FundsTransferService;
import com.jst.service.RTGSFundsTransferService;

public class JavassistTest {

	public static void main(String[] args) {
		FundsTransferService fts = (FundsTransferService)Proxy.newProxyInstance(JavassistTest.class.getClassLoader(), new Class[] {FundsTransferService.class}, new OTPFundsTransferHandler(new RTGSFundsTransferService()));
		String ref = fts.transfer("FAC12521", "TAC52362", 25000, "Deposit");
		System.out.println(ref);
	}
}
