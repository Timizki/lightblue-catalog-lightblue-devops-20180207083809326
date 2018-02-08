package catalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="items")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String description;
	
	@NotNull
	private int price;
	
	@NotNull
	private String img_alt;
	
	@NotNull
	private String img;
	
	@NotNull
	private int stock;
	
	public Inventory(long id) {
		this.id = id;
	}
	
	public Inventory(String name, String desc, int price, String alt, String img, int stock) {
		this.name = name;
		this.description = desc;
		this.price = price;
		this.img_alt = alt;
		this.img = img;
		this.stock = stock;
	}

	public Inventory() {
		
	}	
	
	public String toString() {
		return "name="+name+", id="+this.id;
	}
	
}