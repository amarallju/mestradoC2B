package br.com.c2b.c2bsystemapi.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Sale {
	
	public enum Status {
		OPEN, IN_ANALYSIS, REFUSED, FINNISHED
	}
	private @Id @GeneratedValue Long id;
	private String title;
	private String description;
	private BigDecimal price;
	private Status status;
	
	public Sale() {

	}

	public Sale(String title, String description, BigDecimal price, Status status) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.status = status;
	}
	
	
	
}
