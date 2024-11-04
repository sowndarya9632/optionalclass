package com;

import java.util.Optional;

public class orelsedemo {

	public static void main(String[] args) {
		/*Optional<String> configValue = Optional.ofNullable(System.getenv("MY_CONFIG"));

		// Provide a default configuration value
		String value = configValue.orElse("defaultConfigValue");
		System.out.println("Configuration Value: " + value);*/
		 Optional<String> optionalEmail = getEmailById(1); // Assume this may return an empty Optional

	        // Provide a default email address
	        String email = optionalEmail.orElse("no-email@example.com");
	        System.out.println("Email: " + email);
	    }

	    public static Optional<String> getEmailById(int id) {
	        // Simulating a database lookup that might not find an email
	        return Optional.empty(); // Simulatin

	}

}
