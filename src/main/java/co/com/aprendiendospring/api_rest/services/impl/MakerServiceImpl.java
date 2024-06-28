package co.com.aprendiendospring.api_rest.services.impl;

import co.com.aprendiendospring.api_rest.entities.Maker;
import co.com.aprendiendospring.api_rest.persistences.IMakerDAO;
import co.com.aprendiendospring.api_rest.services.IMakerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakerServiceImpl implements IMakerService {

    private IMakerDAO makerDAO;

    public MakerServiceImpl(IMakerDAO makerDAO) {
        this.makerDAO = makerDAO;
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerDAO.findById(id);
    }

    @Override
    public List<Maker> findAll() {
        return makerDAO.findAll();
    }

    @Override
    public void save(Maker maker) {
        makerDAO.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        makerDAO.deleteById(id);
    }
}
