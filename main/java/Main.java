public class Main {
  public static void main(String[] args) {
    Musica m1 = new Musica("505","Arctic Macacos","sei la","25/20", 180);
    Musica m2 = new Musica("So fé","Grelo","sei la2","2020", 180);
    Playlist p1 = new Playlist("Trap","Musicas de trap muito legais");
    p1.inserir(m1);
    p1.inserir(m2);
    System.out.println(p1.toString());
    p1.listar();
    System.out.println("Tempo total: " + p1.tempototal());
  
  
  }
}