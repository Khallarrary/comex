namespace Comex.modelo;

internal class ItemPedido
{
    public Produto Produto { get; }
    public int Quantidade { get; }
    public double PrecoUnitario { get; }
    public double Subtotal  { get; }

    public ItemPedido(Produto produto, int quantidade) { 
        Produto = produto;  
        Quantidade = quantidade;
        PrecoUnitario =  produto.PrecoUnitario;
        Subtotal =  quantidade * PrecoUnitario;
    }
}
