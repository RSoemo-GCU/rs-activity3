
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User
{
	//Setting user first name with constraints
	@NotNull(message = "Please enter a first name")//?
	@Size(min=5, max=15)
	String firstName = "";
	
	//Setting user last name with constraints
	@NotNull(message = "Please enter a last name")//?
	@Size(min=5, max=15)
	String lastName = "";
	
	//Constructor
	public User()
	{
		firstName = "";
		lastName = "";
	}

	//First Name Getter
	public String getFirstName() { 
		return firstName;
	}

	//First Name Setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Last Name Getter
	public String getLastName() {
		return lastName;
	}

	//Last Name Setter
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
