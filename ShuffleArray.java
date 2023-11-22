import java.util.Random;
public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
	}
        private static void shuffleArray(int[] array) {
            Random random = new Random();
            for (int i = array.length - 1; i > 0; i--) {
                int index = random.nextInt(i + 1);
                // Swap elements
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
}
