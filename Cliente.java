public class Cliente implements identificavel{
    private String nomeCLiente;
    private String cpf;
    private String email;
    private String profissao;
    private String telefone;
    private String endereco;

    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public void setNomeCLiente(String nome) {
        this.nomeCLiente = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


        // 3) Criar interface

    @Override
    public String identifcar() {
        return "Nome: " + this.getNomeCLiente() + "\nCPF: "+ this.getCpf();
    }
}
