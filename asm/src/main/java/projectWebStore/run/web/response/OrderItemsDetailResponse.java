package projectWebStore.run.web.response;

import projectWebStore.run.web.resp.RespOrderItems;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
@SuperBuilder
@Getter
public class OrderItemsDetailResponse extends RespOrderItems {
	Integer idProduct;
	String img;
	String name;
	
	Boolean hoan;
}
