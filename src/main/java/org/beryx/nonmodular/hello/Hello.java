package org.beryx.nonmodular.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
	private static final Logger logger = LoggerFactory.getLogger(Hello.class);

	public static void main(String[] args) {
		logger.info("Hello, non-modular Java!");
	}
}
