
using System.Text.Json;

namespace Comex.modelo;

public class RequisicaoApi
{

    HttpClient client = new HttpClient();


    public async Task<string> Conexao()
    { 
            try
            {
                string resposta = await client.GetStringAsync("https://fakestoreapi.com/products");
                return resposta;
            }

            catch (Exception ex)
            {
                return $"Algo de errado! " + ex.Message;
            }


        }
    }

        