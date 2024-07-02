namespace Comex.modelo;

internal class Pedido
{
    public Cliente Cliente {  get; }
    public DateTime Data { get; }
    public List<ItemPedido> Items { get; }
    public double Total {  get { return Items.Sum(items => items.Subtotal); }  }


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

    public void AdcionarItems (ItemPedido item)
    {
        Items.Add(item);
    }
}
