package projectWebStore.run.service;

import java.util.List;

import org.springframework.ui.Model;

import projectWebStore.run.web.response.OrderItemsDetailResponse;
import projectWebStore.run.web.response.OrderItemsTKResponse;
import jakarta.mail.MessagingException;

public interface ManagerHistoryService {
	// trang
	public String orderView(Model model);

	// trang
	public String orderConfirmOrderView(Model model);

	// trang
	public String orderCancelOrderView(Model model);

	// trang
	public String orderSuccessOrderView(Model model);

	// trang
	public String orderShipOrderView(Model model);

	// trang
	public String orderTKOrderView(Model model);
	//trang
	public String orderHoanOrderView(Model model);

	public String confirm(int id) throws MessagingException;

	public String orderCancel(int id);

	public String orderShipCancel(int id);

	public String ship(int id);

	public String success(int id);

	public String removeOneItem(int idOrder);

	public String giamOneItem(int idOrder);
	
	public List<OrderItemsTKResponse> getTKOrderItemsDetail();

	public void setMonthYear();

	public void setPage();

	public void setSearch();

	public List<String> getMonthYearsOrderCancel();

	List<OrderItemsDetailResponse> requestHoan();
	
	public String noHoan(int id, int idOrder);
	
	public String yesHoan(int id, int idOrder);
}
