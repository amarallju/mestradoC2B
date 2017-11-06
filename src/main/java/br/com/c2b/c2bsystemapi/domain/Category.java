package br.com.c2b.c2bsystemapi.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Getter
@Setter
public class Category {

	private @Id @GeneratedValue Long id;
	private String name;


	public Category() {

	}

	public Category(String name) {
		this.name = name;
	}
	
	
	
}
