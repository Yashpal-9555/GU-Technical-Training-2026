public class Flights {
    public static int[] Reservations(int [][] bookings, int n ){
     int a=0; 
     int [] ans = new int[n];
    
     for(int i=0; i<n; i++){
        if(i == bookings[a][0] || i== bookings[a][1] || (i<= bookings[a][0] && i<=bookings[a][1])){
            ans[i] += bookings[a][2];
        }
        a++;
    }
    
    return ans;
}
/**
 * @param args
 */
public static void main(String args[]){
    int [][] bookings = {{1,2,10}, {2,3,20},{2,5,25}};
    int n = 5;
    System.err.println(Reservations(bookings, n));

    int[][] bookings1 = {{1,3,5},{2,2,10}};
    int n1 = 3;

    System.out.println(Reservations(bookings1, n1));

}
}
