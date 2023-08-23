package projectWebStore.run.service;

import projectWebStore.run.web.request.ReqCart;
import projectWebStore.run.web.response.CartResponse;

public interface ProductService {
	
	CartResponse addCart(ReqCart reqCart);
	
	CartResponse update(ReqCart reqCart);
}
