package badPractice;

import model.User;

public class UserDetailsService {
    private User user;

    public UserDetailsService(User user) {
        this.user = user;
    }

    // task1
    public void changeProfile(Object profile) {
        if (verify()) {
            // changed user profile
        }
    }

    // task2
    public boolean verify() {
        // user must be authorized
        return true;
    }
}
