package it.azienda.progetto.validatori.signin;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import it.azienda.progetto.common.utils.UtilityFunction;

@FacesValidator("lastnameValidator")
public class LastnameValidator implements Validator{

	@Override
	public void validate(FacesContext ctx, UIComponent component, Object value){
		String lastname = (String) value;
		Pattern compile = Pattern.compile("^[a-zA-Z_-]{1,30}$");
		if (! compile.matcher(lastname).matches()){
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.signin.lastname.caratterispeciali"), UtilityFunction.getBundle().getString("error.signin.lastname.caratterispeciali"));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		} else if (lastname.length()>15){
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.signin.lastname.lunghezza"), UtilityFunction.getBundle().getString("error.signin.lastname.lunghezza"));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}
	
	

}
