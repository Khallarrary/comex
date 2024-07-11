using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Comex.modelo;

public class Cliente : Identificavel
{
    public string Nome {  get; set; }
    public string Cpf { get; set; }
    public string Email { get; set; }
    public string Profissao { get; set; }
    public string Telefone { get; set; }
    public Endereco endereco { get; set; }


    public void Identificar()
    {
        Console.WriteLine("Nome do Cliente: " + Nome);
        Console.WriteLine("CPF do Cliente: " + Cpf);
    }
}
