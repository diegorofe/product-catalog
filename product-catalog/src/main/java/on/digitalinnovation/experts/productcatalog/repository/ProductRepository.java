package on.digitalinnovation.experts.productcatalog.repository;

import on.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findById(Integer id);
}
