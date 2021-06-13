package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.model.user.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repo;

        @Test
        public void testCreateUser() {
            User user = new User();
            user.setVardas("Rimantas");
            user.setEmeilas("1@gmail.com");
            user.setMobilusis("37060424988");
            user.setPastatas("naujas");
            user.setZinute("Reikalingas apdailininkas");
            user.setMeistras("Dazytojas");
            user.setPrioritetas(true);
            user.setPradzia("20210701");

            User savedUser = repo.save(user);

            User existUser = entityManager.find(User.class, savedUser.getId());

            assertThat(existUser.getEmeilas()).isEqualTo(user.getEmeilas());


        }

    }
