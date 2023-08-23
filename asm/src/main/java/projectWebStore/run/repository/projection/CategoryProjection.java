package projectWebStore.run.repository.projection;

import java.util.List;

import projectWebStore.run.repository.interfaces.CategoryInterface;
import projectWebStore.run.repository.interfaces.ProductInterface;

public interface CategoryProjection extends CategoryInterface {	
	List<ProductInterface> getProducts();
}
