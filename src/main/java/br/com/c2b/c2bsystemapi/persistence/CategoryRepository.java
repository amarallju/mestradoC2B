package br.com.c2b.c2bsystemapi.persistence;

import br.com.c2b.c2bsystemapi.domain.Category;
import br.com.c2b.c2bsystemapi.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
