package rasmus.zoo.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import rasmus.zoo.models.dto.AnimalDTO;

public interface AnimalRepository extends CrudRepository<AnimalDTO, Integer>, JpaSpecificationExecutor<AnimalDTO> {
}
