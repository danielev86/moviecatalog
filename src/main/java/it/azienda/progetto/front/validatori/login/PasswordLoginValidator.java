package it.azienda.progetto.front.validatori.login;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import it.azienda.progetto.common.utils.UtilityFunction;

@FacesValidator("passwordValidator")
public class PasswordLoginValidator implements Validator {
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object value){
		String password = (String) value;
		if(password.length() <8 || password.length() >15){
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.password.lenght"), UtilityFunction.getBundle().getString("error.password.lenght"));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}

}
