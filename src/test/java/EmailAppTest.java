import org.example.model.Email;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmailAppTest {
    @Test
    public void testSetMailboxCapacity() {
        Email email = new Email("John", "Doe");
        email.setMailboxCapacity(200);
        assertEquals(200, email.getMailboxCapacity());
    }

    @Test
    public void testChangePassword() {
        Email email = new Email("John", "Doe");
        email.changePassword("newPassword");
        assertEquals("newPassword", email.getPassword());
    }

    // Add more test cases for other methods
}
