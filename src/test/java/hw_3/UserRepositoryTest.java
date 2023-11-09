package hw_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepositoryTest {

//    Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов.
//    Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь
//    админскими правами. Протестируйте данную функцию.

    User user1 = new User("User", "123", false);
    User user2 = new User("admin", "admin", true);
    User user3 = new User("guest", "", false);
    User user4 = new User("root", "root", true);
    User user5 = new User("Ondre", " qf", false);
    UserRepository ur = new UserRepository();

    @BeforeEach
    void testInit() {
        user1.authenticate("User", "123");
        user2.authenticate("admin", "admin");
        user3.authenticate("guest", "");
        user4.authenticate("root", "root");
        user5.authenticate("Ondre", " qf");
        ur.addUser(user1);
        ur.addUser(user2);
        ur.addUser(user3);
        ur.addUser(user4);
        ur.addUser(user5);
    }

    @Test
    void testUnauthenticate() {
        ur.UnauthenticateNotAdminUsers();
        assertFalse(user1.isAuthenticate);
        assertTrue(user2.isAuthenticate);
        assertFalse(user3.isAuthenticate);
        assertTrue(user4.isAuthenticate);
        assertFalse(user5.isAuthenticate);
    }

}

