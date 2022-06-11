package com.mvc.model;

import javax.validation.constraints.AssertTrue;

public class User {
//	is restricts user from entering balnk spaces 
//	@NotBlank(message = "name can not be blank")

//	it prevents user from skipping the field but it will accept the blank spaces
//	@NotEmpty(message = "name can not be empty")

//	it will set the minimum and maximum range for the user input 
//	we can use the {} inside the message attribute of the hibernate validation to generate the 
//	set requirements dynamically
//	@Range(min = 2,max = 5,message = "range must be between {min} and {max}")

//	it will set the minimum and maximum range for the user input 
//	we can use the {} inside the message attribute of the hibernate validation to generate the 
//	set requirements dynamically
//	@Length(min = 2,max = 5,message = "the length of the name should be between {min} and {max}")
	private String name;
	
	
	
//	futureorpresent pastorpresent negativeorzero positiveorzero 
	
	
	
//	it will prevent the user from entering the email without providing the valid email
//	@Email(message = "please provide the valid email address")
	private String email;
	
//	pattern is used to pass the regular expression to set the restrictions
//	it is mostly used for password
/*
	^             # start-of-string
(?=.*[0-9])       # a digit must occur at least once
(?=.*[a-z])       # a lower case letter must occur at least once
(?=.*[A-Z])       # an upper case letter must occur at least once
(?=.*[@#$%^&+=])  # a special character must occur at least once
(?=\S+$)          # no whitespace allowed in the entire string
.{8,}             # anything, at least eight places though
$                 # end-of-string
 */
//	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
//			message = "please use only alphabets and numbers for password")	
	private String password;
	
//	min is used to set the least integer that can be used by the user
//	@Min(value = 1000,message = "id should be greater than {value}")
//	max is used to set the highest integer that can be used by the user
//	@Max(value = 10000,message = "id should be smaller than {value}")
	
//	it will accept only negative or zero value from the user
//	@NegativeOrZero(message = "the number should be negative or zero")
	
//	@Negative(message = "the number should be negative")
	
//	it will accept only positive or zero values from the user
//	@PositiveOrZero(message = "the number should be positive or zero")
	
//	it will accept only the positive number from the user
//	@Positive(message = "the number should be positive")
	private int id;
	
//	it wont allow the value until it will fetch the true if the value is false it will prevent the user
	@AssertTrue(message = "please accept terms and conditions")
	private boolean valid;
	
//	@PastOrPresent(message = "accepts date only from the past or present")
//	@Past(message = "accepts only dates from the past")
//	@Future(message = "accepts date only from the future")O
//	@FutureOrPresent(message = "accepts date only from the present and future")
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
