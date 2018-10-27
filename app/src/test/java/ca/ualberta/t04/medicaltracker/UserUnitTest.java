package ca.ualberta.t04.medicaltracker;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UserUnitTest {
    // This method is used to test the class User
    @Test
    public void user_test() {
        // Test the constructor of class User
        User user = new User("Test", "1234", false);
        assertTrue("UserName should be 'Test'", user.getUserName().equals("Test"));
        assertTrue("password should be '1234'", user.getPassword().equals("1234"));
        assertTrue("The user should be a patient", user.isDoctor().equals(false));

        // Test the setter and getter
        user.setMale(true);
        Calendar calendar = Calendar.getInstance();
        Date birthday = calendar.getTime();
        user.setBirthday(birthday);
        user.setPhoneNumber("123456789");
        user.setEmail("test@gmail.com");
        user.setName("AAA");
        user.setPassword("4321");
        assertEquals(user.getMale(), true);
        assertEquals(user.getBirthday(), birthday);
        assertEquals(user.getPhoneNumber(), "123456789");
        assertEquals(user.getEmail(), "test@gmail.com");
        assertEquals(user.getName(), "AAA");
        assertEquals(user.getPassword(), "4321");
    }
}