package com.vikki.SpringEmployee.Emp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "EmpWithPass")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmpWithPass{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@Column(name = "email" ,unique = true)
	private String email;
	
	
}

//
//@Column(name="email", unique=true)
//@Email(message="{register.email.invalid}")
//@NotBlank(message="{register.email.invalid}")
//private String email;
//
//@Transient // meaning it will not be saved in DB
//@Size(min=5, max=15, message="{register.password.size}")
//private String plainPassword; //unencrytped
//
//@Transient
//private String repeatPassword;
//
//@Column(name="password", length=60)
//private String password;
//
//@Column(name="role", length=20)
//private String role;
//
//@Column(name="enabled")
//private Boolean enabled = false;
//
//public void setPlainPassword(String plainPassword) {
//    //System.out.println("PASSWORD BEFORE " + plainPassword);
//    this.password = new BCryptPasswordEncoder().encode(plainPassword);
//    //System.out.println("HERE IS PASSWORD" + this.password + "PASSWORD LENGTH = " + (this.password).length());
//    this.plainPassword = plainPassword;
//}
//
//}