package exemplo.modelDomain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private String cor;
    private String renavam;
    private String chassi;
    private double quilometragem;
    private double proximaTrocaOleo;

    public Veiculo() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }
    public int getAnoModelo() { return anoModelo; }
    public void setAnoModelo(int anoModelo) { this.anoModelo = anoModelo; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public String getRenavam() { return renavam; }
    public void setRenavam(String renavam) { this.renavam = renavam; }
    public String getChassi() { return chassi; }
    public void setChassi(String chassi) { this.chassi = chassi; }
    public double getQuilometragem() { return quilometragem; }
    public void setQuilometragem(double quilometragem) { this.quilometragem = quilometragem; }
    public double getProximaTrocaOleo() { return proximaTrocaOleo; }
    public void setProximaTrocaOleo(double proximaTrocaOleo) { this.proximaTrocaOleo = proximaTrocaOleo; }
}