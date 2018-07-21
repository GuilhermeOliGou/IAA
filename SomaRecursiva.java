public class SomaRecursiva {
    public static void main(String[] args){
        int[] numeros = {3, 5, 27, 48, 2, 3, 10001, 69, 4, 7};
        System.out.println(Soma(numeros));
    }
    
    public static int Soma (int [] vetor){
        return SomaREC(vetor, 0 , vetor.length-1);
    }
    
    public static int SomaREC(int[] vetor, int j, int i){
        if (j < i)
            return vetor[j]+SomaREC(vetor, j+1, i);
        else
            return vetor[j];            
    }
}
