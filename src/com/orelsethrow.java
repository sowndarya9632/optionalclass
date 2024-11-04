package com;

import java.util.Optional;

public class orelsethrow {

	public static void main(String[] args) {
		        Optional<String> optionalPassword = Optional.ofNullable(null); // Empty Optional

		        // Throw an exception if the password is not provided
		        String password = optionalPassword.orElseThrow(() -> new PasswordMissingException("Password is required for registration."));
		    }
		}

		class PasswordMissingException extends RuntimeException {
		    public PasswordMissingException(String message) {
		        super(message);
		    }
		}


