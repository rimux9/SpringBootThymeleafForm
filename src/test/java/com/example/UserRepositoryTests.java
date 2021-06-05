package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.model.user.User;
import com.example.model.user.UserRepository;
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
            user.setEmeilas("rmatuliokas@gmail.com");
            user.setMobilusis("+37060424987");
            user.setPastatas("Namas");
            user.setZinute("sveiki  bus reikalingas remontas");
            user.setMeistras("dazymas");
            user.setPrioritetas(true);
            user.setPradzia(20210621);

            User savedUser = repo.save(user);

            User existUser = entityManager.find(User.class, savedUser.getId());

            assertThat(existUser.getEmeilas()).isEqualTo(user.getEmeilas());


        }

    }
