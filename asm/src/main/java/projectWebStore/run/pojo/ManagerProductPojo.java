package projectWebStore.run.pojo;


import jakarta.validation.constraints.Size;
import lombok.*;
import projectWebStore.run.model.Category;
import jakarta.validation.constraints.NotBlank;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ManagerProductPojo {
	private java.lang.Integer id;
	private String dateAt;

	@NotBlank(message = "Name không được để trống")
	private String names;
	@Size(min = 1, max = 10000)
	private String quantity;
	private String img;

	@Size(max = 1000000000,min = 1)
	private String price;
	@NotBlank(message = "Bạn chưa nhập Mô tả")
	private String descript;
	private Boolean existss = true;
	private Category category;
}
