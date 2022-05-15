package com.tradevan.ca.solid.srp.question;

public class UserPrivilegeService {

    private boolean verifyByRole(User user) {
        if (user.getRole() == Role.ADMIN) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verifyByPhone(User user) {

        // 驗證邏輯...
        return false;
    }

    public boolean hasAccess(User user) {
        return this.verifyByRole(user);
    }
}
