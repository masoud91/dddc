package com.github.masoud91.dddc.domain;

import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private final String emailAddress;

    private Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    static Email of(String emailString) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailString);
        if ( !matcher.find() ) {
            throw new InvalidParameterException("your email is incorrect");
        }
        return new Email(emailString);
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
