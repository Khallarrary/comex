using Comex.modelo;

namespace Comex.Menus;

internal class MenuListarPedidos
{
    public void ListarPedidos(List<Pedido> pedidos)
    {
        Console.Clear();
        if (pedidos.Count == 0) {

            Console.WriteLine("Sem pedidos por aqui");
        }
        else {
            var pedidosOrdenados = pedidos.OrderBy(p => p.Cliente.Nome).ToList();
            pedidosOrdenados.ForEach(p => Console.WriteLine($"Cleinte: {p.Cliente.Nome}\nData do Pedido: {p.Data}\nTotal de produtos: {p.Items.Count}"));
        }

        Console.WriteLine("Digite uma tecla para voltar ao menu principal");
        Console.ReadLine();
    } }
