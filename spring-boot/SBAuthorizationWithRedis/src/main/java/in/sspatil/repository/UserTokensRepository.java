package in.sspatil.repository;

import in.sspatil.model.UserToken;

public interface UserTokensRepository {

	public void save(UserToken userToken);
	
	public UserToken find(String userNameToken);
	
	public void deleteToken(String userNameToken);
	
	public void updateToken(UserToken userToken);
}
