package it.azienda.progetto.front.validatori.signin;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import it.azienda.progetto.common.utils.UtilityFunction;

@FacesValidator("firstnameValidator")
public class FirstnameValidator implements Validator{
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object value){
		String firstname = (String) value;
		Pattern compile = Pattern.compile("^[a-zA-Z_-]{1,30}$");
		if (!compile.matcher(firstname).matches()){
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.signin.firstname.caratterispeciali")
						,UtilityFunction.getBundle().getString("error.signin.firstname.caratterispeciali")
					);
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			((UIInput) component.findComponent("firstnameSignin")).setSubmittedValue("");;
			throw new ValidatorException(message);
			
		}else if (firstname.length()>15){
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.signin.firstname.lunghezza"), UtilityFunction.getBundle().getString("error.signin.firstname.lunghezza"));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			((UIInput) component.findComponent("firstnameSignin")).setSubmittedValue("");;
			throw new ValidatorException(message);
		}else {
			
		}
	}

}
