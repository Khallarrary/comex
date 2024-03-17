public class Cliente implements identificavel{
    private String nomeCLiente;
    private String cpf;


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
    
        // 3) Criar interface

    @Override
    public String identifcar() {
        return "Nome: " + this.getNomeCLiente() + "\nCPF: "+ this.getCpf();
    }
}
