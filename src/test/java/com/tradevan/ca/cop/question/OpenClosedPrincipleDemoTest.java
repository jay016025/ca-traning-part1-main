package com.tradevan.ca.cop.question;

import com.tradevan.ca.solid.ocp.question.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OpenClosedPrincipleDemoTest {

    @Mock
    MortgageLoanValidator mortgageLoanValidator;
    @Mock
    PersonalLoanValidator personalLoanValidator;

    @InjectMocks
    LoanHandler handler;

    @Test
    public void testRunMortgageLoanValidator() {

        // Arrange
        User user = new User();

        // Ack
        handler.approve(user);

        //Assert
        Mockito.verify(mortgageLoanValidator).validtor(user);
    }

    @Test
    public void testRunPersonalLoanValidator() {

        // Arrange
        User user = new User();

        // Ack
        handler.approve(user);

        //Assert
        Mockito.verify(personalLoanValidator).validtor(user);
    }
}
