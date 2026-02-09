package dao;

import antlr.collections.List;
import model.Employee;

public interface EmployeeDAO {
    void save(Employee employee);
    java.util.List<Employee> findAll();
    Employee findById(int id);
    void delete(int id);
}
