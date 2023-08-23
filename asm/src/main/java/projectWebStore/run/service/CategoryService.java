package projectWebStore.run.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import projectWebStore.run.web.request.ReqCategory;
import projectWebStore.run.web.response.CategoryResponse;

public interface CategoryService {
	ResponseEntity<String> update(ReqCategory request);
	
	ResponseEntity<String> delete(ReqCategory request);
	
	ResponseEntity<CategoryResponse> create(ReqCategory request);
	
	public List<CategoryResponse> getAll();
}
