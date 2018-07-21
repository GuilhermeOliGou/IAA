public class DivisaoRecursiva {
    public static void main(String[] args){
        int dividendo = 8000, divisor = 25;
        System.out.println(Divisao(dividendo, divisor));
    }

    public static int Divisao (int j, int i){
	if (j%i == 0)
	    return DivisaoREC(j, i);
	return -1;
    }
    
    public static int DivisaoREC(int j, int i){
        if (j > i)
            return 1 + DivisaoREC(j-i, i);
        else 
            return 1;
    }
}
