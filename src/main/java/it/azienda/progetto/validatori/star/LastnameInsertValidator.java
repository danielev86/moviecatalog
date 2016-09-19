package it.azienda.progetto.validatori.star;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import it.azienda.progetto.common.utils.UtilityFunction;

@FacesValidator("lastnameInsertValidator")
public class LastnameInsertValidator implements Validator{
	
	public void validate(FacesContext context, UIComponent component, Object value)throws ValidatorException{
		String lastName = (String) value;
		if (UtilityFunction.isNotAlphanumericCharacter(lastName)){
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.addstar.firstname.alphanumeric"), 
					UtilityFunction.getBundle().getString("error.addstar.firstname.alphanumeric"));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}

}
