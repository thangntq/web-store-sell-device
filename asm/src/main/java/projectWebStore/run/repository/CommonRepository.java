package projectWebStore.run.repository;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface CommonRepository<T, ID> extends JpaRepository<T, ID> {
	<T> List<T> findBy(Class<T> classType);
	<T> Page<T> findBy(Class<T> classType, Pageable pageable);


	
}
