import java.util.Random;
import java.util.ArrayList;

public class Bingo{
  private int numBingo;
  Random r = new Random();
  int limiteInferior = 1;
  int limiteSuperior = 100;
  int[] bingo;
  int index = 0;
  ArrayList<Integer> verif_sorteio;
  
  public Bingo(int numBingo){
    this.numBingo = numBingo;
    bingo = new int[numBingo];
    verif_sorteio = new ArrayList<>();
  }
  
  public int getnumBingo(){
    return numBingo;
  }

  public void iniciar(int numBingo){
    for (int i = 0; i < numBingo; i++){
    proximo();
    }
    }
  
  public void proximo(){
    int numeroSorteado;
    do {
      numeroSorteado = r.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    } while (verif_sorteio.contains(numeroSorteado));
    bingo[index] = numeroSorteado;
    verif_sorteio.add(numeroSorteado);
    index++;
      }

    public int[] getNumSorteados(){
      return bingo;
    }
  
  public void Sorteados(int[] NumSorteados){
    System.out.println("Numeros sorteados:");
    for(int numero : NumSorteados){
      System.out.println(numero);
    }
  }
  
}