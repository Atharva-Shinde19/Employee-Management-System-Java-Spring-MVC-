package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmployeeDAO;
import model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO dao;

    @Override
    public List<Employee> findAll() {
        return dao.findAll();
    }

    @Override
    public void save(Employee employee) {
        dao.save(employee);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}
