package in.sspatil.util.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import in.sspatil.model.UserCreds;

@Component
public class UserCredsValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {		
		return UserCreds.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors e) {		
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "UserName", "e.Username", "Username is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "Password", "e.Password", "Password is required");
	
	}

}
