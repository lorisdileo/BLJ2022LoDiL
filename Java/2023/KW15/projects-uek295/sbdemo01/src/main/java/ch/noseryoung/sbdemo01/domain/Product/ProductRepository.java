package ch.noseryoung.sbdemo01.domain.Product;

import ch.noseryoung.sbdemo01.domain.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
