package com.ifpi.fichadengue.models;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.UUID;

public class FormsModel {
    // Dados Gerais - Informações
    private UUID id;
    private int tipoNotificacao;
    private String agravo;
    private String uf;
    private String municipioNotificacao;
    private String unidadeSaude;
    private String codigoCID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNotificacao;
    private String codigoIBGE;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataPrimeirosSintomas;

    // Notificação Individual - Informações 
    private String nomePaciente;
    private Date dataNascimento;
    private int idade;
    private String sexo;
    private String gestante;
    private String raca;
    private String escolaridade;
    private String cartaoSus;
    private String nomeMae;

    // Dados de Residência - Informações
    private String ufResidence;
    private String municipioResidencia;
    private String codigoIbgeResidence;
    private String distrito;
    private String bairro;
    private String logradouro;
    private int numeroResidencia;
    private String complemento;
    private String geoCampo1;
    private String geoCampo2;
    private String pontoReferencia;
    private String Cep;
    private String telefone;
    private String zona;
    private String pais;
    

    // Construtor
    public FormsModel() {}

    // Getters e Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getTipoNotificacao() {
        return tipoNotificacao;
    }

    public void setTipoNotificacao(int tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public String getAgravo() {
        return agravo;
    }

    public void setAgravo(String agravo) {
        this.agravo = agravo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipioNotificacao() {
        return municipioNotificacao;
    }

    public void setMunicipioNotificacao(String municipioNotificacao) {
        this.municipioNotificacao = municipioNotificacao;
    }

    public String getUnidadeSaude() {
        return unidadeSaude;
    }

    public void setUnidadeSaude(String unidadeSaude) {
        this.unidadeSaude = unidadeSaude;
    }

    public String getCodigoCID() {
        return codigoCID;
    }

    public void setCodigoCID(String codigoCID) {
        this.codigoCID = codigoCID;
    }

    public Date getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(Date dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public Date getDataPrimeirosSintomas() {
        return dataPrimeirosSintomas;
    }

    public void setDataPrimeirosSintomas(Date dataPrimeirosSintomas) {
        this.dataPrimeirosSintomas = dataPrimeirosSintomas;
    }

    @Override
    public String toString() {
        return "GeneralDataModel{" +
                "id=" + id +
                ", tipoNotificacao=" + tipoNotificacao +
                ", agravo='" + agravo + '\'' +
                ", uf='" + uf + '\'' +
                ", municipioNotificacao='" + municipioNotificacao + '\'' +
                ", unidadeSaude='" + unidadeSaude + '\'' +
                ", codigoCID='" + codigoCID + '\'' +
                ", dataNotificacao=" + dataNotificacao +
                ", codigoIBGE='" + codigoIBGE + '\'' +
                ", dataPrimeirosSintomas=" + dataPrimeirosSintomas +
                '}';
    }


    
}

