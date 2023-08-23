package projectWebStore.run.service;

import java.util.List;
import org.springframework.data.domain.Page;
import projectWebStore.run.repository.interfaces.PriceBetweenInterface;
import projectWebStore.run.web.request.ProductSearchRequest;
import projectWebStore.run.web.response.PriceBetweenResponse;
import projectWebStore.run.web.response.ProductResponse;

public interface SearchByCategoryService {
	Page<ProductResponse> getProductResponses(int page);
	
	void setSpec(ProductSearchRequest productSearchRequest);
	
	void setCategory(int category);
	
	List<PriceBetweenResponse> getPriceBetweenResponses();
	
	
	PriceBetweenResponse toPriceBetweenResponse(PriceBetweenInterface priceBetweenInterface);
}
