package co.com.aprendiendospring.api_rest.persistences.impl;

import co.com.aprendiendospring.api_rest.entities.Product;
import co.com.aprendiendospring.api_rest.persistences.IProductDAO;
import co.com.aprendiendospring.api_rest.repositories.ProductRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class ProductDAOImp implements IProductDAO {

    private ProductRepository productRepository;

    public ProductDAOImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findProductByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
