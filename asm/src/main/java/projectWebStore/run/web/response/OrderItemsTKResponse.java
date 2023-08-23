package projectWebStore.run.web.response;

import projectWebStore.run.web.resp.RespOrderItems;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
@SuperBuilder
@Getter
public class OrderItemsTKResponse extends RespOrderItems {
	
	OrderResponse order;
}
