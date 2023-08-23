package projectWebStore.run.web.response;

import projectWebStore.run.web.resp.RespOrder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
@SuperBuilder
@Getter
public class OrderResponse extends RespOrder {
	public String email;
}
