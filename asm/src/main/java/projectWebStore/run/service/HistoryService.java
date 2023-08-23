package projectWebStore.run.service;

import org.springframework.ui.Model;

import projectWebStore.run.model.OrdersItems;

public interface HistoryService {
	void getOrderResponses(Model model,int status);
	
	
	OrdersItems hoan(int id);
	String updateOrder(OrdersItems item);
	
	String saveCancelOrder(Integer id);
}
