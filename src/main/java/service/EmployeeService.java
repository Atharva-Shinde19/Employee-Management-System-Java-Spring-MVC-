package service;

import java.util.List;
import model.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    void save(Employee employee);

    void delete(int id);
}
