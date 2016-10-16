package it.azienda.progetto.front.validatori.star;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import it.azienda.progetto.common.utils.UtilityFunction;
@FacesValidator("firstnameInsertValidator")
public class FirstnameInsertValidator implements Validator {

	
	public void validate(FacesContext ctx, UIComponent component, Object value)throws ValidatorException{
		String firstname = (String) value;
		if (UtilityFunction.isNotAlphanumericCharacter(firstname)){
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.addstar.firstname.alphanumeric")
					,UtilityFunction.getBundle().getString("error.addstar.firstname.alphanumeric"));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}
}
