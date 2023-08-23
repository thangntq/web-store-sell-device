package projectWebStore.run.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projectWebStore.run.repository.OrderItemsRepository;
import projectWebStore.run.repository.ProductRepository;
import projectWebStore.run.utils.BuilderOrderToOrderResp;
import projectWebStore.run.web.response.OrderItemsTKResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class Test {
	final OrderItemsRepository itemsRepository;
	final ProductRepository productRepository;
	final BuilderOrderToOrderResp builderOrderToOrderResp;
	
	@GetMapping
	public List<OrderItemsTKResponse> get(){
		return builderOrderToOrderResp
				.toOrderItemsTKResponses(
						itemsRepository.tkOrderItemDetail(998,6,2023));
	}
}
