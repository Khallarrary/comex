        // 2) Crie a classe Produto
public class produto {
    private String nome;
    private String descrição;
    private double preçoUnitario;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getPreçoUnitario() {
        return preçoUnitario;
    }

    public void setPreçoUnitario(double preçoUnitario) {
        this.preçoUnitario = preçoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public void exibeProduto(){
        System.out.println("Produto: " + nome);
        System.out.println("Valor do Produto: " + preçoUnitario);
    }





}
