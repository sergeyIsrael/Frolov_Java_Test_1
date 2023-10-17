public class ArrayX3 {
    public static void main(String[] args) {

        int[] array = {3, 7, 18, 100, 200, 55};
        for(int i : array)
        {
            if (i % 3 == 0) {
                System.out.println (i);
            }
        }
    }
}

