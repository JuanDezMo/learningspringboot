package co.com.aprendiendospring.api_rest.repositories;

import co.com.aprendiendospring.api_rest.entities.Maker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository extends JpaRepository<Maker, Long> {
}
