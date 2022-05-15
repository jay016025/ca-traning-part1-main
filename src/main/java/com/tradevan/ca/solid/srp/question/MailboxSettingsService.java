package com.tradevan.ca.solid.srp.question;

public class MailboxSettingsService {

	private UserPrivilegeService verify = new UserPrivilegeService();

	public void changeSecondaryEmail(User user, String newSecondaryEmail) {
		if (verify.hasAccess(user)) {
			user.setSecondaryEmail(newSecondaryEmail);
		}
	}

}


