public class TorreDeHanoiRecursiva {
    
    public static void main(String[] args) {
        Hanoi(1,3,3);
    } 
    
    public static void Hanoi (int inicio, int fim, int pecas){
        HanoiRec(inicio, ((inicio < fim) && (Math.abs(fim - inicio) != 2)), pecas);
    }
    
    public static void HanoiRec(int a, boolean d, int p){
        if (a == 0)
            a = 3;
        else if (a == 4)
            a = 1;
        if (p > 1){
            HanoiRec(a, !d, p-1);
            Printa(a, d, p);
            if (d)
                HanoiRec(a-1, !d, p-1);
            else 
                HanoiRec(a+1, !d, p-1);
        }else 
            Printa(a, d, p);
    }
    
    public static void Printa(int a, boolean d, int p){
        int  b = a;
        if (d)
            b++;
        else 
            b--;
        if (b == 0)
            b = 3;
        else if (b == 4)
            b = 1;
        System.out.println("Peça " + p + " da posição " + a + " para a posição " + b);
    }
            
}
