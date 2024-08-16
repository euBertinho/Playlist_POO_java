import java.util.ArrayList;

public class Playlist{
    private String nome;
    private String descricao;
    private ArrayList<Musica> musicas = new ArrayList<>();

  public Playlist(String nome, String descricao){
    this.nome = nome;
    this.descricao = descricao;
  }

  public void inserir(Musica musica) {
    this.musicas.add(musica);
  }

  public void listar() {
    if (musicas.isEmpty()) {
      System.out.println("Playlist vazia");
    } else {
      System.out.println("Musicas: ");
      for (Musica musica : musicas) {
        System.out.println("- " + musica);
        System.out.println();
      }
    }
  }

  public int tempototal(){
    int soma = 0;
    for (int i = 0; i < musicas.size(); i++){
      soma = soma + musicas.get(i).getTempo();
    }
    return soma;
  }

@Override
  public String toString(){
    return "Playlist: " + nome + "\n" + "descrição: " + descricao + "\n";
  }

}