package br.com.c2b.c2bsystemapi.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
@Getter
@Setter
public class User {

	private @Id @GeneratedValue Long id;
	private String name;
	private String password;
	private String email;
	private String cpfCnpj;


	public User() {

	}

	public User(String name, String password, String email, String cpfCnpj) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.cpfCnpj = cpfCnpj;
	}
	
	
	
}
