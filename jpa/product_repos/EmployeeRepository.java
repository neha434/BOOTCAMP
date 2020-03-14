package hibernate.jpa.product_repos;

import hibernate.jpa.product.Employee;
//import hibernate.jpa.product.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//Q.2) Set up EmployeeRepository with Spring Data JPA


public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    //void delete(int );
    List<Employee> findByName(String name);
    List<Employee>findByNameLike(String name);
    List<Employee> findByAgeBetween(int age1, int age2);

   // List<Employee> findAll(Pageable pageable);
}
