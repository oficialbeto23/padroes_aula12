package com.manoelcampos.modelo;


import lombok.*;

@Builder @Getter @Setter @ToString
public class Paciente {
    /**
     * Id que identifica unicamente um paciente.
     */
    private long id;
    private String nome;
    private char sexo;
    private String cpf;
    private String rg = "";
    private String orgaoEmissorRg = "";
    private String cidade;
    private String uf;

    /** Peso para cálculo do IMC. */
    private double peso;

    /** Altura para cálculo do IMC. */
    private double altura;



    Paciente(long id, String nome, char sexo, String cpf, String rg, String orgaoEmissorRg, String cidade, String uf, double peso, double altura) {
        this.setId(id);
        this.setNome(nome);
        this.setSexo(sexo);
        this.setCpf(cpf);
        this.setRg(rg);
        this.setOrgaoEmissorRg(orgaoEmissorRg);
        this.setCidade(cidade);
        this.setUf(uf);
        this.setPeso(peso);
        this.setAltura(altura);
    }



    public final void setNome(String nome) {
        if(nome.isBlank()){
            throw new IllegalArgumentException("Nome é obrigatório.");
        }

        this.nome = nome;
    }

    public final void setSexo(char sexo) {
        if(sexo == '\0'){
            throw new IllegalArgumentException("Sexo é obrigatório.");
        }

        sexo = Character.toUpperCase(sexo);
        if(sexo != 'M' && sexo != 'F'){
            throw new IllegalArgumentException("Sexo inválido. Informe M ou F.");
        }

        this.sexo = sexo;
    }

    public final void setCpf( String cpf) {
        if(cpf.isBlank()){
            throw new IllegalArgumentException("CPF é obrigatório.");
        }

        this.cpf = cpf;
    }

    public final void setCidade(String cidade) {
        if(cidade == null || cidade.isBlank()){
            throw new IllegalArgumentException("Cidade é obrigatória.");
        }

        this.cidade = cidade;
    }

    public final void setUf( String uf) {
        if(uf == null ||uf.isBlank()){
            throw new IllegalArgumentException("UF é obrigatória.");
        }

        this.uf = uf;
    }
}
