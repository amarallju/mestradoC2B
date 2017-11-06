package br.com.c2b.c2bsystemapi.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class SaleProposal {

	public enum Status {
		OPEN, IN_ANALYSIS, REFUSED, FINNISHED
	}
	private @Id @GeneratedValue Long id;
	private Long saleId;
	private BigDecimal price;
	private Status status;

	public SaleProposal() {

	}

	public SaleProposal(BigDecimal price, Status status) {
		this.price = price;
		this.status = status;
	}
	
	
	
}
