package it.azienda.progetto.validatori.login;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;

import it.azienda.progetto.common.utils.UtilityFunction;

@FacesValidator("usernameValidator")
public class UsernameLoginValidator implements Validator {
	@Override
	public void validate(FacesContext context, UIComponent component, Object value){
		String username = (String) value;
		if (username.length() < 8  ||  username.length() > 15){
//			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.username.length"), UtilityFunction.getBundle().getString("error.username.length"));
//			message.setSeverity(FacesMessage.SEVERITY_ERROR);
//			context.addMessage(null, message);
//			
			UtilityFunction.messageError("error.username.length");
		}else if(username.contains("%") || username.contains("$") ){
			UtilityFunction.messageError("error.username.nocharacter");
		}else{
			
		}
		
	}

}
