package projectWebStore.run.repository;

import java.util.List;
import org.springframework.stereotype.Repository;

import projectWebStore.run.model.Category;

@Repository
public interface CategoryRepository extends CommonRepository<Category, Integer> {
	<T> List<T> findBy(Class<T> classType);
	
	
	
}
