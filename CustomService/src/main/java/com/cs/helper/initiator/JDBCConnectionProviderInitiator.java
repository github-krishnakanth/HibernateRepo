package com.cs.helper.initiator;

import java.util.Map;

import org.hibernate.boot.registry.StandardServiceInitiator;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.spi.ServiceRegistryImplementor;

import com.cs.helper.JDBCConnectionProviderImpl;

public class JDBCConnectionProviderInitiator implements StandardServiceInitiator<ConnectionProvider>{

	@Override
	public Class<ConnectionProvider> getServiceInitiated() {
		System.out.println("getServiceInitiated()...");
		return null;
	}

	@Override
	public JDBCConnectionProviderImpl initiateService(Map configurationValues, ServiceRegistryImplementor registry) {
		System.out.println("Configuration Values: "+configurationValues);
		System.out.println("Service Registry Implementor: "+registry.getClass().getName());
		JDBCConnectionProviderImpl provider = new JDBCConnectionProviderImpl();
		return provider;
	}
}
