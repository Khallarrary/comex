        // 2) Crie a classe Livro

public class Livro extends produto implements identificavel{
    private String isbn;
    private double totalPaginas;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(double totalPaginas) {
        this.totalPaginas = totalPaginas;
    }


    // 3) Criar interface

    @Override
    public String identifcar() {
        return "Nome: " + this.getNome() + "\nISBN: " + this.getIsbn();
    }
}
