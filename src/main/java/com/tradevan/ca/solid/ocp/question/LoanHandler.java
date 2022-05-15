package com.tradevan.ca.solid.ocp.question;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoanHandler {

	private final IValidtor validtor;

	public void approve(User user) {
		validtor.validtor(user);
	}

}
