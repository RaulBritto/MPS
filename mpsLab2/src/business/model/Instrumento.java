package business.model;
import java.io.Serializable;
public class Instrumento implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int code;
	private String brand;
	private String description;
	private int quantity;
	
	public Instrumento(String name, String brand, int quant){
		this.name = name;
		this.brand = brand;
		this.quantity = quant;
		setCode(0);
		setDescription("Sem descrição");
	}
	
	public Instrumento(String name, String brand, int quant,int code, String description){
		this(name,brand,quant);
		if(code != 0) setCode(code); 
	}
	
	
	public int getQuantity(){
		return quantity;
	}
	
	public String getName(){
		return name;
	}
	
	public void setCode(int code){
		//if(code < 0) //throws new CodeException();
		this.code = code;
	}
	
	public int getCode(){
		return code;
	}
	
	
	public void setDescription(String desc){
		description =  desc;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String toString(){
		return "\nInstrumento: " + name + ""+
				"\t Marca " + brand  +
				"\t Código:" + code + 
				"\t Descrição: " + description +
				"\t Quantidade: " + quantity;
	}
	
}