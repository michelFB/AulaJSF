package autenticação;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "valida")
public class validacao implements Validator{

public validacao(){};

@Override
public void validate(FacesContext arg0, UIComponent arg1,  Object value) throws ValidatorException{
	String codigo = (String) value;
	if(codigo == null || ((String) codigo).length() > 3)
	{
		((UIInput) arg1).setValid(false);
		FacesMessage message = new FacesMessage("Errado!");
		arg0.addMessage(arg1.getClientId(arg0), message);
	}
}

}



