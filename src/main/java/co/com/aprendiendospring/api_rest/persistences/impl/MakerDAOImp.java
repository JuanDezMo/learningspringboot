package co.com.aprendiendospring.api_rest.persistences.impl;

import co.com.aprendiendospring.api_rest.entities.Maker;
import co.com.aprendiendospring.api_rest.persistences.IMakerDAO;
import co.com.aprendiendospring.api_rest.repositories.MakerRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDAOImp implements IMakerDAO {

    private MakerRepository makerRepository;

    public MakerDAOImp(MakerRepository makerRepository) {
        this.makerRepository = makerRepository;
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerRepository.findById(id);
    }

    @Override
    public List<Maker> findAll() {
        return makerRepository.findAll();
    }

    @Override
    public void save(Maker maker) {
        makerRepository.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        makerRepository.deleteById(id);
    }
}
