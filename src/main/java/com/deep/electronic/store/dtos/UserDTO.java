package com.deep.electronic.store.dtos;

import com.deep.electronic.store.validate.ImageNameValid;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

	private String userId;
	
	@Size(min=3,max =20,message="Invalid Name !!")
	private String name;
	@Email(message ="Invalid Email")
	private String email;
	@Size(min = 5, max = 21, message = "Invalid Email")
	private String password;
	@NotBlank
	private String gender;
	@Size(min=3, max =100, message = "Take a look to About")
	private String about;
	@ImageNameValid
	private String imageName;


}
