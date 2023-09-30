package seminars.third.coverage;

import Seminar.third.tdd.User;
import Seminar.third.tdd.UserRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class UserRepositoryTest {
    @Test
    public void testLogoutUser() {
        User first = new User("Max", "adm123", true);
        first.authenticate("Max", "adm123");
        User second = new User("Olga", "Olga123", false);
        second.authenticate("Olga", "Olga123");
        User third = new User("Petr", "Petr123", false);
        third.authenticate("Petr", "Petr123");

        UserRepository userRepository = new UserRepository();

        userRepository.addUser(first);
        userRepository.addUser(second);
        userRepository.addUser(third);

        userRepository.logoutUser();

        assertThat(userRepository.getData().get(0)).isEqualTo(first);
    }
}
