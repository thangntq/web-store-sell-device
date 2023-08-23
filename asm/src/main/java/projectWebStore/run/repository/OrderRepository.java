package projectWebStore.run.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import projectWebStore.run.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer>{
	
	@Query("SELECT o from Orders o where o.statuss = ?1 and o.customerID.id = ?2 order by o.orderDate desc")
	List<Orders> findByStatus(int status, Integer idCustomer);

	
	@Query("SELECT o from Orders o where o.statuss = ?1 and o.orderID = ?2")
	Orders findByStatusID(int status, Integer idOrder);
	
	@Query("SELECT o from Orders o where o.statuss = ?1 order by o.orderDate desc")
	Page<Orders> findByStatus(int status,Pageable pageable);
	
	@Query("""
			SELECT o from Orders o
			where o.statuss = :status and year(o.orderDate) = :year and month(o.orderDate) = :month
			order by o.orderDate desc
			""")
	Page<Orders> findByStatus(int status,int year, int month,Pageable pageable);
	
	@Query("select distinct (CAST(YEAR(o.orderDate) as String) \r\n"
			+ "	+ iif(MONTH(o.orderDate) < 10, '0'+ cast(MONTH(o.orderDate) as String),"
			+ "cast(MONTH(o.orderDate) as String))) AS YearMonth from Orders o "
			+ "where o.statuss = :status order by YearMonth desc")
	List<String> findAllMonthYear(int status);
}
