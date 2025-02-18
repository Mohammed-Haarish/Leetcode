import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    c++;
                }
            }
            al.add(c); 
            c = 0; 
        }

        
        int[] arr = new int[k];

        
        for (int i = 0; i < k; i++) {
            int a = Collections.min(al); 
            int index = al.indexOf(a);   
            arr[i] = index;              

            
            al.set(index, Integer.MAX_VALUE);  
        }

        return arr;
    }
}
