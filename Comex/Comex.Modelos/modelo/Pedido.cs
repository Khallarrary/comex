namespace Comex.modelo;


/// <summary>
/// Representa um pedido realizado por um cliente.
/// </summary>
public class Pedido
{
    
    public Cliente Cliente {  get; }
    /// <summary>
    /// Obtem  a data em que o pedido foi realizado.
    /// </summary>

    public DateTime Data { get; }
    /// <summary>
    /// Obtem a lista de items de pedido.
    /// </summary>
    public List<ItemPedido> Items { get; }

    /// <summary>
    /// Obtem o valor total do pedido.
    /// </summary>
    public double Total {  get { return Items.Sum(items => items.Subtotal); }  }


    /// <summary>
    /// Inicializa uma nova instancia da classe Pedido com um Cliente especifico.
    /// </summary>
    public Pedido (Cliente cliente)
    {
        Cliente = cliente;
        Data = DateTime.Now;
        Items = new List<ItemPedido> ();
    }

    public void ExibirDetalhesDoPedido()
    {
        Console.WriteLine($"Cliente: {Cliente.Nome} \n Data do Pedido: {Data}" );
        Items.ForEach((items => Console.WriteLine($"Items: {items.Produto.Nome } || Quantidade: {items.Quantidade} || Sub Total: {items.Subtotal}")));
        Console.WriteLine($"Valor Total do Pedido: R$ {Total}");
    }

    /// <summary>
    /// Adciona um item ao pedido e atualiza o valor total.
    /// </summary>
    /// <param name="item">O item a ser adcionado ao pedido</param>
    public void AdcionarItems (ItemPedido item)
    {
        Items.Add(item);
    }
}
