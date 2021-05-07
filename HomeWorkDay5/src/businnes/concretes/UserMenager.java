package businnes.concretes;

import businnes.abstracts.UserService;
import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class UserMenager  implements UserService {

	private UserDao userDao;
	private AuthService authService;

	public UserMenager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void login(User user) {
		authService.login(user);
	}

	@Override
	public void register(User user) {
		authService.register(user);

	}

}
