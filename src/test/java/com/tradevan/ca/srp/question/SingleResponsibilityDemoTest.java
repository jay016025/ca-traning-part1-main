package com.tradevan.ca.srp.question;

import com.tradevan.ca.solid.srp.question.Role;
import com.tradevan.ca.solid.srp.question.SingleResponsibilityDemo;
import com.tradevan.ca.solid.srp.question.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleResponsibilityDemoTest {

    SingleResponsibilityDemo demo = new SingleResponsibilityDemo();

    @Test
    public void srpDemoTest() {

        // Arrange
        User user = new User();
        user.setRole(Role.ADMIN);
        user.setAmount(1000);

        // Act
        demo.demo(user);

        // Assert
        Assertions.assertAll(
                () -> {Assertions.assertEquals("newemail@email.com", user.getSecondaryEmail());},
                () -> {Assertions.assertEquals(0, user.getAmount());}
        );

    }
}
