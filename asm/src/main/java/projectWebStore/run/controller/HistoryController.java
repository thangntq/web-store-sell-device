package projectWebStore.run.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import projectWebStore.run.model.OrdersItems;
import projectWebStore.run.repository.OrderItemsRepository;
import projectWebStore.run.repository.OrderRepository;
import projectWebStore.run.repository.UpdateStatusRepository;
import projectWebStore.run.service.HistoryService;
import projectWebStore.run.service.Param;
import projectWebStore.run.service.Session;
import projectWebStore.run.utils.BuilderOrderStatus;
import projectWebStore.run.utils.BuilderOrderToOrderResp;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("history")
public class HistoryController {
	final BuilderOrderToOrderResp builderOrderToOrderResp;
	final BuilderOrderStatus builderOrderStatus;
	final OrderRepository orderRepository;
	final OrderItemsRepository orderItemsRepository;
	final UpdateStatusRepository updateStatusRepository;
	final Session session;
	final Param param;
	final HistoryService historyService;

	@GetMapping
	public String view(Model model) {
		model.addAttribute("page", "include/history/history.jsp");
		return "index";
	}

	@GetMapping("/order")
	public String orderView(Model model) {
		historyService.getOrderResponses(model, 1);
		model.addAttribute("order", "");
		return "forward:/history";
	}


	// hủy đơn hàng
	@GetMapping("/cancel/{id}")
	public String orderCancel(@PathVariable("id") Integer id) {
		return historyService.saveCancelOrder(id);
	}

	// trang view order bị hủy
	@GetMapping("/order/cancel")
	public String orderCancelView(Model model) {
		historyService.getOrderResponses(model, 0);
		model.addAttribute("orderCancel", "");
		return "forward:/history";
	}

	// trang view đơn hàng đã xác nhận
	@GetMapping("/order/confirm")
	public String orderConfirmView(Model model) {
		historyService.getOrderResponses(model, 2);
		return "forward:/history";
	}
	
	// trang view đơn hàng đã xác nhận
	@GetMapping("/order/ship")
	public String orderShipView(Model model) {
		historyService.getOrderResponses(model, 3);
		return "forward:/history";
	}
	
	// trang view đơn hàng đã xác nhận
	@GetMapping("/order/success")
	public String orderSuccessView(Model model) {
		historyService.getOrderResponses(model, 4);
		model.addAttribute("page", "include/history/historySuccess.jsp");
		return "index";
	}

	@GetMapping("/hoan/{id}")
	public String hoan(@PathVariable("id") Integer id) {
		OrdersItems items = historyService.hoan(id);
		return historyService.updateOrder(items);
	}
}
