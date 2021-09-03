package rasmus.zoo.repository;

import org.springframework.data.repository.CrudRepository;
import rasmus.zoo.models.dto.EmployeeDTO;


public interface EmployeeRepository extends CrudRepository<EmployeeDTO, Integer> {
}
