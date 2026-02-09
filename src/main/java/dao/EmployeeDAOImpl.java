package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Employee emp) {
        sessionFactory
            .getCurrentSession()
            .saveOrUpdate(emp);
    }

    public List<Employee> findAll() {
        return sessionFactory
            .getCurrentSession()
            .createQuery("from Employee", Employee.class)
            .list();
    }

    public Employee findById(int id) {
        return sessionFactory
            .getCurrentSession()
            .get(Employee.class, id);
    }

    public void delete(int id) {
        Employee emp = findById(id);
        if (emp != null) {
            sessionFactory
                .getCurrentSession()
                .delete(emp);
        }
    }
}
