package projectWebStore.run.repository.projection;

import projectWebStore.run.repository.interfaces.CategoryInterface;
import projectWebStore.run.repository.interfaces.ProductInterface;

public interface ProductProjection extends ProductInterface{
	CategoryInterface getCategory();
}
