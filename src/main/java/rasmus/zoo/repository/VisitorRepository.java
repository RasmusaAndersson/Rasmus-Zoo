package rasmus.zoo.repository;

import org.springframework.data.repository.CrudRepository;
import rasmus.zoo.models.dto.VisitorDTO;

public interface VisitorRepository extends CrudRepository<VisitorDTO, Integer> {
}
