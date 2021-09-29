package on.digitalinnovation.experts.productcatalog.repository;

import on.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
