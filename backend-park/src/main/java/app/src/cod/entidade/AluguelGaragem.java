package app.src.cod.entidade;

import java.math.BigDecimal;
import java.util.Objects;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "park-api")
public class AluguelGaragem {

	private String id;
	private String tituloAnuncio;
	private String tipoLogradouroString;
	private String descricaoLocal;

	private String estado;
	private String cidade;
	private String rua;
	private String bairro;
	private String numero;
	private String complementoLocal;
    
	private String cep;

	private String tipoPagamento;
	private BigDecimal preco;
    
	public AluguelGaragem() {
		super();
	}

	public AluguelGaragem(String tituloAnuncio, String tipoLogradouroString, String descricaoLocal, String estado,
			String cidade, String rua, String bairro, String numero, String complementoLocal, String cep,
			String tipoPagamento, BigDecimal preco) {
		super();

		this.tituloAnuncio = tituloAnuncio;
		this.tipoLogradouroString = tipoLogradouroString;
		this.descricaoLocal = descricaoLocal;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.complementoLocal = complementoLocal;
		this.cep = cep;
		this.tipoPagamento = tipoPagamento;
		this.preco = preco;
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
	public String getTituloAnuncio() {
		return tituloAnuncio;
	}

	public void setTituloAnuncio(String tituloAnuncio) {
		this.tituloAnuncio = tituloAnuncio;
	}

	@DynamoDBAttribute
	public String getTipoLogradouroString() {
		return tipoLogradouroString;
	}

	public void setTipoLogradouroString(String tipoLogradouroString) {
		this.tipoLogradouroString = tipoLogradouroString;
	}

	@DynamoDBAttribute
	public String getDescricaoLocal() {
		return descricaoLocal;
	}

	public void setDescricaoLocal(String descricaoLocal) {
		this.descricaoLocal = descricaoLocal;
	}

	@DynamoDBAttribute
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@DynamoDBAttribute
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@DynamoDBAttribute
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	@DynamoDBAttribute
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@DynamoDBAttribute
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@DynamoDBAttribute
	public String getComplementoLocal() {
		return complementoLocal;
	}

	public void setComplementoLocal(String complementoLocal) {
		this.complementoLocal = complementoLocal;
	}

	@DynamoDBAttribute
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	@Override
	public String toString() {
		return "AluguelGaragem [id=" + id + ", tituloAnuncio=" + tituloAnuncio + ", tipoLogradouroString="
				+ tipoLogradouroString + ", descricaoLocal=" + descricaoLocal + ", estado=" + estado + ", cidade="
				+ cidade + ", rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + ", complementoLocal="
				+ complementoLocal + ", cep=" + cep + ", tipoPagamento=" + tipoPagamento + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, complementoLocal, descricaoLocal, estado, id, numero, preco, rua,
				tipoLogradouroString, tipoPagamento, tituloAnuncio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AluguelGaragem other = (AluguelGaragem) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(complementoLocal, other.complementoLocal)
				&& Objects.equals(descricaoLocal, other.descricaoLocal) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(numero, other.numero)
				&& Objects.equals(preco, other.preco) && Objects.equals(rua, other.rua)
				&& Objects.equals(tipoLogradouroString, other.tipoLogradouroString)
				&& Objects.equals(tipoPagamento, other.tipoPagamento)
				&& Objects.equals(tituloAnuncio, other.tituloAnuncio);
	}

}
