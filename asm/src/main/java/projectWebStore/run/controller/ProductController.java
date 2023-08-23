package projectWebStore.run.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import projectWebStore.run.service.InforPageService;
import projectWebStore.run.service.Param;
import projectWebStore.run.service.ProductService;
import projectWebStore.run.service.ShoppingCartService;
import projectWebStore.run.service.api.impl.APIProductService;
import projectWebStore.run.service.impl.SearchByCategoryServiceImpl;
import projectWebStore.run.web.request.ProductSearchRequest;
import projectWebStore.run.web.request.ReqCart;
import projectWebStore.run.web.response.CartResponse;
import projectWebStore.run.web.response.ProductResponse;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {
	final ProductService productService;
	final SearchByCategoryServiceImpl searchByCategoryService;
	final ShoppingCartService shoppingCartService;
	final Param param;
	final APIProductService apiProductService;
	final InforPageService inforPageService;
	
	@PostMapping("/addCart")
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public CartResponse add(@RequestBody ReqCart reqCart) {
		return productService.addCart(reqCart);
	}
	
	@PostMapping("/cart/disting")
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public CartResponse updateCart(@RequestBody ReqCart reqCart) {
		return productService.update(reqCart);
	}
	
	
	@GetMapping("/search")
	private String searchView(Model model) {
		inforPageService.setSearch("search");
		model.addAttribute("searchProducts",
				apiProductService.getProductSearch(inforPageService.getSearch(),0));
		model.addAttribute("page", "include/search.jsp");
		model.addAttribute("myCart", shoppingCartService.getCount());
		return "index";
	}
	
	
	@GetMapping("/search/by/category/{id}")
	public String searchByCategory(@PathVariable("id") int category, Model model) {
		searchByCategoryService.setCategory(category);
		searchByCategoryService.setSpec(new ProductSearchRequest());
		model.addAttribute("myCart", shoppingCartService.getCount());
		model.addAttribute("prices", searchByCategoryService.getPriceBetweenResponses());
		model.addAttribute("page", "include/searchByCategory.jsp");
		model.addAttribute("searchByCategory", searchByCategoryService.getProductResponses(category));
		return "index";
	}
	
	
	@ResponseBody
	@PostMapping("/search/by/categoryValue")
	public Page<ProductResponse> searchByCategory(@RequestBody ProductSearchRequest productSearchRequest) {
		searchByCategoryService.setSpec(productSearchRequest);
		return searchByCategoryService.getProductResponses(0);
	}
	
	@ResponseBody
	@PostMapping("/search/by/categoryPage")
	public Page<ProductResponse> searchByCategory() {
		int page = param.getInt("page", 1);
		return searchByCategoryService.getProductResponses(page);
	}


}
