package app.prod.src.backend_collection.entidade;

import java.math.BigDecimal;
import java.util.Objects;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "park-service-collection")
public class FormasdePagamento {
	
	private String id;
	private String tipoPagamento;
	private BigDecimal preco;
	
	private boolean temIPTU = false; 
	private BigDecimal valorIPTU;
	
	public FormasdePagamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormasdePagamento(String tipoPagamento, BigDecimal preco, boolean temIPTU, BigDecimal valorIPTU) {
		super();
		this.tipoPagamento = tipoPagamento;
		this.preco = preco;
		this.temIPTU = temIPTU;
		this.valorIPTU = valorIPTU;
	}
    
	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@DynamoDBAttribute
	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	@DynamoDBAttribute
	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
    
	@DynamoDBAttribute
	public boolean isTemIPTU() {
		return temIPTU;
	}

	public void setTemIPTU(boolean temIPTU) {
		this.temIPTU = temIPTU;
	}
    
	@DynamoDBAttribute
	public BigDecimal getValorIPTU() {
		return valorIPTU;
	}

	public void setValorIPTU(BigDecimal valorIPTU) {
		this.valorIPTU = valorIPTU;
	}

	@Override
	public String toString() {
		return "FormasdePagamento [id=" + id + ", tipoPagamento=" + tipoPagamento + ", preco=" + preco + ", temIPTU="
				+ temIPTU + ", valorIPTU=" + valorIPTU + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, preco, temIPTU, tipoPagamento, valorIPTU);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormasdePagamento other = (FormasdePagamento) obj;
		return Objects.equals(id, other.id) && Objects.equals(preco, other.preco) && temIPTU == other.temIPTU
				&& Objects.equals(tipoPagamento, other.tipoPagamento) && Objects.equals(valorIPTU, other.valorIPTU);
	}
}
