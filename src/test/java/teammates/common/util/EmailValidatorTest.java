package teammates.common.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class EmailValidatorTest {

    @Test
    public void testValidEmail() {
        assertTrue(EmailValidator.isValid("user@example.com"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(EmailValidator.isValid("invalid-email"));
        assertFalse(EmailValidator.isValid("user@"));
        assertFalse(EmailValidator.isValid("@example.com"));
        assertFalse(EmailValidator.isValid("user@@example.com"));
    }

    @Test
    public void testNullOrEmptyEmail() {
        assertFalse(EmailValidator.isValid(null));
        assertFalse(EmailValidator.isValid(""));
        assertFalse(EmailValidator.isValid("   "));
    }
}
