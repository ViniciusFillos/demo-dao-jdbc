package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n============ TEST 1: seller findById =============");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n============ TEST 2: seller findAll =============");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n============ TEST 3: seller insert =============");
        Department newDepartment = new Department(null, "Computers");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id = " + newDepartment.getId());

        System.out.println("\n============ TEST 4: department update =============");
        department = departmentDao.findById(1);
        department.setName("Kitchen");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n============ TEST 5: department delete =============");
        System.out.print("Enter id for delete test: ");
        int id = new Scanner(System.in).nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
    }
}
