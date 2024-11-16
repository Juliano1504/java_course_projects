package Model;

public abstract class ModelExec03 {
    
    public static int[] Executa(int min, int size){
        int[] valores = new int[size];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = i + min;
        }
        // int[] v = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        // return v;
        return valores;
    }


}
