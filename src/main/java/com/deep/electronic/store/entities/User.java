package com.deep.electronic.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	private String userId;
	@Column(name="user_name")
	private String name;
	@Column(name = "user_email",unique = true)
	private String email;
	@Column(name = "user_password",length=10)
	private String password;
	private String gender;
	@Column(length = 10000)
	private String about;
	@Column(name="user_image_name")
	private String imageName;

}
