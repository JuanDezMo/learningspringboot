package co.com.aprendiendospring.api_rest.repositories;

import co.com.aprendiendospring.api_rest.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price >= ?1 AND p.price <= ?2")
    List<Product> findProductByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    // Aplicando QUery Methods
    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
}
