package rasmus.zoo.dao;

import org.springframework.stereotype.Repository;
import rasmus.zoo.models.dto.EmployeeDTO;
import rasmus.zoo.repository.EmployeeRepository;

import java.util.Optional;

@Repository
public class EmployeeDAO {

    EmployeeRepository employeeRepository;

    public EmployeeDAO(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Iterable<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<EmployeeDTO> findEmployeeByID(Integer id) {
        return employeeRepository.findById(id);
    }

    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        return employeeRepository.save(employeeDTO);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
