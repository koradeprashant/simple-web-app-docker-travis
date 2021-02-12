package com.web.repository;

import com.web.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

@SpringBootTest
@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
public class UserRepositoryTest {

  @Autowired private UserRepository userRepository;

  @Test
  public void userAddTest() {
    String testUser = "testUser";
    User u = userRepository.save(new User(testUser));
    Optional<User> oUser = userRepository.findById(u.getId());
    assert (oUser.isPresent());
    assert (testUser.equals(oUser.get().getName()));
    //assert ("testUserb".equals(oUser.get().getName()));
  }
}
