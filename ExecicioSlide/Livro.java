package pkgabstract;

public class Livro implements ItemDeBiblioteca {

  private String tituloLivro;

  public String disponivel() {

    return (tituloLivro);
  }

  public void emprestado() {

  }

}