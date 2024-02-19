public class faixaEtaria {
    public static void main(String[] args) {
        int ano = 2023;
        String name;
        name = "Fulano";
        int dataDeNascimento = 1980;
        int idade = ano - dataDeNascimento;

        String name2;
        name2 = "Sicrano";
        int dataDeNascimento2 = 2000;
        int idade2 = ano - dataDeNascimento2;


        System.out.println(">>> Listagem de Clientes" +
                "\n>>> Ano Atual: " + ano);

        System.out.println("____________________________");


        System.out.println("Nome: " + name);
        System.out.println("Data de nascimento: " + dataDeNascimento);
        System.out.println("Idade: " + idade);

        if (idade <= 17) {
            System.out.println("Faixa Etaria: Adolecente");
        } else { if (idade >= 18 && idade <=29) {System.out.println("Faixa Etaria: Jovem");}
            else {
            if (idade >= 30 && idade <= 59) {
                System.out.println("Faixa Etaria: Adulto");
            } else {
                System.out.println("Faixa Etaria: Idoso");
            }

        }
        }

        System.out.println("____________________________");


        System.out.println("Nome: " + name2);
        System.out.println("Data de nascimento: " + dataDeNascimento2);
        System.out.println("Idade: " + idade2);

        if (idade <= 17) {
            System.out.println("Faixa Etaria: Adolecente");
        } else { if (idade >= 18 && idade <=29) {System.out.println("Faixa Etaria: Jovem");}
        else {
            if (idade >= 30 && idade <= 59) {
                System.out.println("Faixa Etaria: Adulto");
            } else {
                System.out.println("Faixa Etaria: Idoso");
            }

        }
        }
    }
}
