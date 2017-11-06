package br.com.c2b.c2bsystemapi.persistence;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.c2b.c2bsystemapi.domain.Sale;
/**	
 * only to create data should be deleted later
 * @author ian
 *
 */
@Component
public class DataLoaderSampler implements CommandLineRunner {
	
	private final SaleRepository saleRepository;
	
	
	@Autowired
	public DataLoaderSampler(SaleRepository saleRepository) {
		this.saleRepository = saleRepository;
	}



	@Override
	public void run(String... arg0) throws Exception {
		this.saleRepository.save(new Sale("Iphone8", "Iphone 8 novo", BigDecimal.TEN, Sale.Status.OPEN));
	}

}
