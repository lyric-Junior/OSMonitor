package com.server.osinspector.model.dto;

import java.sql.Blob;
import java.sql.Date;
import java.time.LocalDateTime;

public class ServiceOrderDTO {

    private int controle;
    private String cliente;
    private String funcionario;
    private String solicitante;
    private String endereco;
    private String bairro;
    private String cidade;
    private String telefoneComercial;
    private String celular;
    private String defeito;
    private String descricaoObjeto;
    private LocalDateTime dataEHoraCadastro;
    private String text;
    private String complemento;
    private String cor;
    private String status;
    private String descricaoListaServico;
    private Date dataEntrega;
    private String codigoObra;
    private String codigoArt;
    private String formaDePagamento;
    private String chassi;
    private String marca;
    private String placa;
    private String oficina;
    private String statusEnvio;
    private int referenciaOs;
    private Date dataFinalizacao;
    private String laudoTecnico;
    private String nomeFantasia;
    private Blob imagemObjeto;
    private int codHospedagem;
}
