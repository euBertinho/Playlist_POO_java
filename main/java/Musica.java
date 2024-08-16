public class Musica{
  private String titulo;
  private String artista;
  private String album;
  private String datainclusao;
  private int tempo;

  public Musica(String titulo, String artista, String album, String datainclusao, int tempo){
    this.titulo = titulo;
    this.artista = artista;
    this.album = album;
    this.datainclusao = datainclusao;
    this.tempo = tempo;
  }


  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getArtista() {
    return artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getDatainclusao() {
    return datainclusao;
  }

  public void setDatainclusao(String datainclusao) {
    this.datainclusao = datainclusao;
  }

  public int getTempo(){
    return tempo;
  }
  public void setTempo(int tempo){
    this.tempo = tempo;
  }

  
  @Override
  public String toString() {
    return  "titulo: '" + titulo + "'" + "\n" +
            "• artista: '" + artista + "'" + "\n" +
            "• album: '" + album + "'" + "\n" +
            "• datainclusao: '" + datainclusao + "'" +  "\n" + 
            "• tempo: '" + tempo + "'";
  }





}