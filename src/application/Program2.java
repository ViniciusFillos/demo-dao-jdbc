package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n============ TEST 1: seller findById =============");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n============ TEST 2: seller findAll =============");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);
    }
}
