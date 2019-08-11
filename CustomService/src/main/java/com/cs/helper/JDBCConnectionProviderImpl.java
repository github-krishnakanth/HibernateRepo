package com.cs.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.exception.spi.Configurable;
import org.hibernate.service.spi.Startable;
import org.hibernate.service.spi.Stoppable;

public class JDBCConnectionProviderImpl implements ConnectionProvider, Startable, Stoppable, Configurable{
	private static final long serialVersionUID = 1L;

	@Override
	public boolean isUnwrappableAs(Class classType) {
		System.out.println("isUnwrappableAs()");
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> classType) {
		System.out.println("unwrap()");
		return null;
	}

	@Override
	public void configure(Properties properties) throws HibernateException {
		System.out.println("configure()");
	}

	@Override
	public void stop() {
		System.out.println("Stopping...");
	}

	@Override
	public void start() {
		System.out.println("Starting...");
	}

	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		
		System.out.println("getConnection()");
		try {
		Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/christydb", "root", "root");
		conn.setAutoCommit(false);
		return conn;
	}

	@Override
	public void closeConnection(Connection conn) throws SQLException {
		if(conn!=null && conn.isClosed()==false) {
			conn.close();
			System.out.println("closeConnection()");
		}
	}

	@Override
	public boolean supportsAggressiveRelease() {
		System.out.println("supportAggressiveRelease()");
		return false;
	}
}
