package bestPractice;

import model.User;

public class UserAuthService {
    private User user;

    public UserAuthService(User user) {
        this.user = user;
    }
    public boolean verify() {
        // user must be authorized
        return true;
    }
}
