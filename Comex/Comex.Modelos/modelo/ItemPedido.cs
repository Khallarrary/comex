namespace Comex.modelo;
/// <summary>
/// Representa um item de um pedido.
/// </summary>
public class ItemPedido
{
    /// <summary>
    /// Obtem o produto do item pedido.
    /// </summary>
    public Produto Produto { get; }
    /// <summary>
    /// Obtem a quantidade do produto no item de pedido.
    /// </summary>
    public int Quantidade { get; }
    /// <summary>
    /// Obtem o preço unitario do produto.
    /// </summary>
    public double PrecoUnitario { get; }
    /// <summary>
    /// Obtem o subtotal do item de pedido calculado como quantidade vezes o preço unitario.
    /// </summary>
    public double Subtotal  { get; }

    /// <summary>
    /// Inicializa uma nova instancia da classe ItemPedido com produto e uma quantiade.
    /// </summary>
    /// <param name="produto">O produto do item do pedido.</param>
    /// <param name="quantidade">A quantidade do produto no item do pedido.</param>
    public ItemPedido(Produto produto, int quantidade) { 
        Produto = produto;  
        Quantidade = quantidade;
        PrecoUnitario =  produto.PrecoUnitario;
        Subtotal =  quantidade * PrecoUnitario;
    }
}
