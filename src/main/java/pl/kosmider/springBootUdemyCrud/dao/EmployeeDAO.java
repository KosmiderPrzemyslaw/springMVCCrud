package pl.kosmider.springBootUdemyCrud.dao;

import pl.kosmider.springBootUdemyCrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

    //add method sort by last name

    public List<Employee> findAllByOrderByLastNameAsc();
}
