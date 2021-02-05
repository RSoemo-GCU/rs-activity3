package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped
public class FormController 
{
	//On submission
	public String onSubmit(User user)
	{
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestResponse.xhtml";
	}
	
	//On flash
	public String onFlash(User user)
	{
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "TestResponse.xhtml?faces-redirect=true";
	}
}