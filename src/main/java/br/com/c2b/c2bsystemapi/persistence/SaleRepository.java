package br.com.c2b.c2bsystemapi.persistence;

import org.springframework.data.repository.CrudRepository;

import br.com.c2b.c2bsystemapi.domain.Sale;

public interface SaleRepository extends CrudRepository<Sale, Long> {

}
