public class App {
    public static void main(String[] args) throws Exception {
        int[] list = { 0,1,2,3,4,5,65,65,7,8,9,10,11,12,13,24,35,46,57,1,61,64,33,22,11,10,77,88,11 };
        for(int i= 0; i < list.length; i++) {
            int index = list[i] % list.length;
            list[index] += list.length;
        }

        for(int i = 0; i < list.length; i++) {
            if((list[i] / list.length) >= 2 ) {

            }
        }
        System.out.println();
    }
}
