package projectWebStore.run.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import projectWebStore.run.model.Product;

public interface ProductRepository
		extends CommonRepository<Product, Integer>, JpaSpecificationExecutor<Product> {

	@Query(value = "SELECT * FROM PRODUCT WHERE id = ?1", nativeQuery = true)
	List<Product> findByAgeGreaterThan(int id);
	
	Page<Product> findByNamesLike(String name, Pageable pageable);
	
	<T> List<T> findById(Integer id,Class<T> classType);
	
	
	@Query("SELECT p FROM Product p WHERE p.names like %:name%")
	<T> Page<T> findBy(@Param("name") String name, Pageable pageable, Class<T> classType);
	

}
