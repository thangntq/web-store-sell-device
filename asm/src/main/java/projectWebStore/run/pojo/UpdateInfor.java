package projectWebStore.run.pojo;

import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class UpdateInfor {
	@Pattern(regexp = "^\\w{3,}+@\\w{3,}+(\\.\\w{2,}+){1,2}$", message = "Bạn phải nhập đúng định dạng email")
	private String email;
	
	
	@Length(min = 5,message = "Tên phải trên 5 ký tự")
	private String name;
	
	@Size(min = 0, max = 100)
	private String age;
	
	@Length(min = 5,message = "Địa chỉ phải trên 5 ký tự")
	private String address;
	
	@Pattern(message = "Điện thoại chỉ đúng 10 số và bắt đầu bằng 0",regexp = "^0\\d{9}$")
	private String phone;
	
	private Boolean gender;
	
	
}
