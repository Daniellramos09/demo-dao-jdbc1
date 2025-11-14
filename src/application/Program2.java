package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: seller findById ====");
        Department department = departmentDao.findById(3);

        System.out.println(department);

        System.out.println("\n=== TEST 2: seller findByIdDepartment ====");
        department = new Department(2, null);
        // Linha 28 (CORRETO)
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll ====");
        list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }


        System.out.println("\n=== TEST 4: seller Insert ====");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Insert! New id = " + newDepartment.getId());



        System.out.println("\n=== TEST 5: seller Update ====");
        department = departmentDao.findById(2);
        department.setName("McDonald");
        departmentDao.update(department);
        System.out.println("Update completed");


        System.out.println("\n=== TEST 6: seller findAll ====");
        System.out.println("Enter id for delete test:");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();

    }
}
