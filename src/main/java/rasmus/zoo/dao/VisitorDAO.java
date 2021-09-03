package rasmus.zoo.dao;

import org.springframework.stereotype.Repository;
import rasmus.zoo.models.dto.VisitorDTO;
import rasmus.zoo.repository.VisitorRepository;

import java.util.Optional;

@Repository
public class VisitorDAO {

    private final VisitorRepository visitorRepository;

    public VisitorDAO(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public Iterable<VisitorDTO> getAllVisitors() {
        return visitorRepository.findAll();
    }

    public VisitorDTO addVisitor(VisitorDTO visitorDTO) {
        return visitorRepository.save(visitorDTO);
    }

    public Optional<VisitorDTO> getVisitorById(Integer id) {
        return visitorRepository.findById(id);
    }

    public void deleteVisitor(Integer id) {
        visitorRepository.deleteById(id);
    }
}
