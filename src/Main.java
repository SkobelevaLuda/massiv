public class Main {
    public static void main(String[] args) {
        // задание 1,2.
        int [] weights = {1, 2, 3};
        for(int i=0; i<weights.length; i++){
            System.out.print(weights[i]);
            if (i!=weights.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        double [] volume = {1.57, 7.654, 9.986};
        for(int i=0;i<volume.length;i++) {
            System.out.print(volume[i]);
            if (i != volume.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int [] pot = new int[] {1, 3, 7};
        for(int i=0;i<pot.length;i++){
            System.out.print(pot[i]);
            if (i!=pot.length-1){
                System.out.print(", ");
            }
        }
        System.out.println ();

        // задание 3.
        int [] weights1 = {1, 2, 3};
        for(int i= weights1.length-1; i>=0; i--){
            System.out.print(weights1[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
        double [] volume1 = {1.57, 7.654, 9.986};
        for(int i=volume1.length-1; i>=0; i--) {
            System.out.print(volume1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int [] pot1 = new int[] {1, 3, 7};
        for(int i=pot1.length-1;i>=0; i--){
            System.out.print(pot1[i]);
            if (i!= 0){
                System.out.print(", ");
            }
        }
        System.out.println ();

        // задание 4.
        int [] road = {1, 2, 3};
        for (int i=0;i<road.length;i++) {
            if(road[i]%2!=0){
                road[i]+=1;
            }
            System.out.println(road[i]);
        }
    }
}