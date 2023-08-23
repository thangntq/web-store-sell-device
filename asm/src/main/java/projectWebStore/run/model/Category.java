package projectWebStore.run.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "category")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String names;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Product> products;
	
	

	public Category(String names) {
		this.names = names;
	}
	
	
}
