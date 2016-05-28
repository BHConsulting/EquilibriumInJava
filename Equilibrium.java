/**
 * Created by Min on 28/05/2016.
 */
public class Equilibrium {

    public static void main(String [] args)
    {
        Equilibrium sol = new Equilibrium();
        System.out.println("results ="+sol.solution(new int[] {-1, 3,-4,5,1,-6,2,1}));
    }

    public int solution(int[] A) {
        return equi(A, A.length);
    }

    int equi(int arr[], int n) {
        if (n==0) return -1;
        double sum = 0;
        int i;
        for(i=0;i<n;i++) sum+=(double) arr[i];

        double sum_left = 0;
        for(i=0;i<n;i++) {
            double sum_right = sum - sum_left - (double) arr[i];
            if (sum_left == sum_right) return i;
            sum_left += (double) arr[i];
        }
        return -1;
    }
}
