package com.hhp.exception;

public class DataNotPersistedException extends Exception {

	private static final long serialVersionUID = -4009526587953934752L;

	public DataNotPersistedException() {
		super();
	}

	public DataNotPersistedException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public DataNotPersistedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DataNotPersistedException(String arg0) {
		super(arg0);
	}

	public DataNotPersistedException(Throwable arg0) {
		super(arg0);
	}
}
