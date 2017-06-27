package com.example;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

@ApplicationPath("/")
public class App extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		return Collections.singleton(HelloEndpoint.class);
	}
}
