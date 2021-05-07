package core.adapters;

import core.abstracts.AuthService;

public class GoogleAuthManagerAdapter  implements AuthService {
GoogleAuthManager manager = new GoogleAuthManager();
	
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		manager.login();
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		manager.register();
	}
}
