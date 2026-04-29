package com.server.osinspector.model.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "TOS")
public class TOS {
    @Getter @Setter
    private int controle;

    @Getter @Setter
    private Date dataFaturada;

    @Getter @Setter
    private int codCliente;

    @Getter @Setter
    private String cliente;

    @Getter @Setter
    private int codFuncionario;

    @Getter @Setter
    private String funcionario;

    @Getter @Setter
    private String solicitante;

    @Getter @Setter
    private String rg;

    @Getter @Setter
    private String ie;

    @Getter @Setter
    private String im;

    @Getter @Setter
    private String cep;

    @Getter @Setter
    private String endereco;

    @Getter @Setter
    private String bairro;

    @Getter @Setter
    private String cidade;

    @Getter @Setter
    private String uf;

    @Getter @Setter
    private String telefoneComercial;

    @Getter @Setter
    private String telefoneResidencial;

    @Getter @Setter
    private String celular;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String numero;

    @Getter @Setter
    private String defeito;

    @Getter @Setter
    private String descricaoObjeto;

    @Getter @Setter
    private BigDecimal valorTotal;

    @Getter @Setter
    private BigDecimal totalDesconto;

    @Getter @Setter
    private LocalDateTime dataEHoraCadastro;

    @Getter @Setter
    private Double totalAcrescimo;

    @Getter @Setter
    private String text;

    @Getter @Setter
    private String campo1;

    @Getter @Setter
    private String campo2;

    @Getter @Setter
    private String campo3;

    @Getter @Setter
    private String campo4;

    @Getter @Setter
    private String campo5;

    @Getter @Setter
    private String campo6;

    @Getter @Setter
    private int codObjeto;

    @Getter @Setter
    private String complemento;

    @Getter @Setter
    private int codCidade;

    @Getter @Setter
    private String enviada;

    @Getter @Setter
    private String situacao;

    @Getter @Setter
    private String cor;

    @Getter @Setter
    private String cancelada;

    @Getter @Setter
    private String protocolo;

    @Getter @Setter
    private String status;

    @Getter @Setter
    private BigDecimal valorServicos;

    @Getter @Setter
    private BigDecimal valorTotais;

    @Getter @Setter
    private String serie;

    @Getter @Setter
    private String situacoaNfse;

    @Getter @Setter
    private int codListaServico;

    @Getter @Setter
    private String descricaoListaServico;

    @Getter @Setter
    private Date dataEntrega;

    @Getter @Setter
    private String numeroNfse;

    @Getter @Setter
    private String codigoObra;

    @Getter @Setter
    private String codigoArt;

    @Getter @Setter
    private BigDecimal valorEntrada;

    @Getter @Setter
    private int numeros;

    @Getter @Setter
    private String cpf;

    @Getter @Setter
    private String cnpj;

    @Getter @Setter
    private int aliquotaSiss;

    @Getter @Setter
    private String formaDePagamento;

    @Getter @Setter
    private String chassi;

    @Getter @Setter
    private String marca;

    @Getter @Setter
    private String anoFabricacao;

    @Getter @Setter
    private String placa;

    @Getter @Setter
    private String numeroRenavam;

    @Getter @Setter
    private String modelo;

    @Getter @Setter
    private String numeroDav;

    @Getter @Setter
    private String tituloDav;

    @Getter @Setter
    private int coo;

    @Getter @Setter
    private int cooVinculado;

    @Getter @Setter
    private String marcaEcf;

    @Getter @Setter
    private String modeloEcf;

    @Getter @Setter
    private String numeroEcf;

    @Getter @Setter
    private int ccf;

    @Getter @Setter
    private String serieEcf;

    @Getter @Setter
    private String oficina;

    @Getter @Setter
    private String numeroRps;

    @Getter @Setter
    private String mesclar;

    @Getter @Setter
    private String md5Dav;

    @Getter @Setter
    private String tipoEcf;

    @Getter @Setter
    private String davAnterior;

    @Getter @Setter
    private String aVista;

    @Getter @Setter
    private String statusEnvio;

    @Getter @Setter
    private BigDecimal valorProdutos;

    @Getter @Setter
    private int numeroLote;

    @Getter @Setter
    private int referenciaOs;

    @Getter @Setter
    private Date dataFinalizacao;

    @Getter @Setter
    private String tributacao;

    @Getter @Setter
    private String laudoTecnico;

    @Getter @Setter
    private Double totalDescontoItem;

    @Getter @Setter
    private String faturaDaTotal;

    @Getter @Setter
    private String nomeFantasia;

    @Getter @Setter
    private Blob imagemObjeto;

    @Getter @Setter
    private String naturezaDaOperacao;

    @Getter @Setter
    private int codVendedor;

    @Getter @Setter
    private String vendedor;

    @Getter @Setter
    private String campo7;

    @Getter @Setter
    private String campo8;

    @Getter @Setter
    private String campo9;

    @Getter @Setter
    private String campo10;

    @Getter @Setter
    private String campo11;

    @Getter @Setter
    private String campo12;

    @Getter @Setter
    private String campo13;

    @Getter @Setter
    private String campo14;

    @Getter @Setter
    private String campo15;

    @Getter @Setter
    private String campo16;

    @Getter @Setter
    private String campo17;

    @Getter @Setter
    private String campo18;

    @Getter @Setter
    private String campo19;

    @Getter @Setter
    private String campo20;

    @Getter @Setter
    private String indicador;

    @Getter @Setter
    private int codNfe;

    @Getter @Setter
    private int numeroNfe;

    @Getter @Setter
    private char enviadoSgNaWeb;

    @Getter @Setter
    private int codMunincidentaiss;

    @Getter @Setter
    private int codAgendamentoMeuSg;

    @Getter @Setter
    private int codPet;

    @Getter @Setter
    private int codConsulta;

    @Getter @Setter
    private int codInternacaoCirurgia;

    @Getter @Setter
    private int codVacina;

    @Getter @Setter
    private int codHospedagem;
}
