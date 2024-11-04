package com;

import java.util.Optional;

public class orelseget {

	public static void main(String[] args) {
		Optional<String> optionalUsername = getUsernameById(1); // Assume this may return an empty Optional

        String username = optionalUsername.orElseGet(() -> generateDefaultUsername());
        System.out.println("Username: " + username);
    }

    public static Optional<String> getUsernameById(int id) {
        return Optional.empty(); // Simulating no username found
    }

    public static String generateDefaultUsername() {
         return "sow";
	}

}
