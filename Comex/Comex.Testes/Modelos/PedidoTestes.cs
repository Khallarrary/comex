using Comex.modelo;

namespace Comex.Testes;

public class Pedid
{
    [Fact]
    public void PedidoDeveInicializarComClienteEDataCorreta()
    {
        //Arrenge
        var cliente = new Cliente { Nome = "JR" };


        //Act
        var pedido = new Pedido(cliente);

        //Assert
        Assert.Equal(cliente, pedido.Cliente);
        Assert.Empty(pedido.Items);
        Assert.Equal(0, pedido.Total);
    }

    [Theory]
    [InlineData("Produto A", 100.0, 2)]
    [InlineData("Produto B", 120.0, 5)]
    [InlineData("Produto C", 200.0, 3)]
    public void AdcionarItemDeveAdcionarItemEAtualizarTotal(string nomeProduto, double precoUnitario, int quantidade)
    {
        //Arrenge

        var cliente = new Cliente { Nome = "JR" };
        var pedido = new Pedido(cliente);
        var produto = new Produto(nomeProduto) { PrecoUnitario = precoUnitario, };
        var itemDePedido = new ItemPedido(produto, quantidade);
        var esperadoTotal = precoUnitario * quantidade;

        //Act

        pedido.AdcionarItems(itemDePedido);

        //Assert

        Assert.Contains(itemDePedido, pedido.Items);
        Assert.Equal(esperadoTotal, pedido.Total);

    }
}