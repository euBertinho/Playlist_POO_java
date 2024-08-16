public class Main {
  public static void main(String[] args) {
  Bingo b1 = new Bingo(5);
    b1.iniciar(5);

    int[] NumSorteados = b1.getNumSorteados();
    b1.Sorteados(NumSorteados);
    
    
  }
}