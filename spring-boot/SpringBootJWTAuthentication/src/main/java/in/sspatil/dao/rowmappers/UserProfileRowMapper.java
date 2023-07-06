package in.sspatil.dao.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sspatil.model.UserCreds;
import in.sspatil.model.UserProfile;

public class UserProfileRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserProfile userProfile=new UserProfile();
				
		userProfile.setUser_Code(rs.getInt("User_Code"));
		userProfile.setFirst_Name(rs.getString("First_Name"));
		userProfile.setEmail_Id(rs.getString("Email_Id"));
		userProfile.setPassword(rs.getString("Password"));
		userProfile.setAccess_Type(rs.getString("Access_Type"));
				
		return userProfile;
	}

}
