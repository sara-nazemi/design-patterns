package bestPractice;

import model.User;

public class ChangeProfileService {

    private User user;
    private UserAuthService userAuthService;

    public ChangeProfileService(User user) {
        this.user = user;
        this.userAuthService=new UserAuthService(user);
    }

    public void changeProfile(Object profile) {
        if (this.userAuthService.verify()) {
            // changed user profile
        }
    }
}
