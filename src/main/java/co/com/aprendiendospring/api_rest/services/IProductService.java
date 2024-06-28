package co.com.aprendiendospring.api_rest.services;

import co.com.aprendiendospring.api_rest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService {

    Optional<Product> findById(Long id);

    List<Product> findAll();

    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    void save(Product product);

    void deleteById(Long id);
}
