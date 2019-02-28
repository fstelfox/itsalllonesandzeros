import java.util.Arrays;
import java.util.Random;

public class Sets {

	
	public static void main(String [ ] args)
	{
		Sets set = new Sets();
		int[] array = new int[8]; 
		array = set.randOrder();
		set.reorder(array);
	}
	
	
	public int[] randOrder() {
		Random rand = new Random();
		int[] index = new int[8];
		int random;
		for(int i = 0; i < 8; i++) {
			do {
				random = rand.nextInt();
			} while(Arrays.asList(index).contains(random));
			index[i] = random;
		}	
		return index;
	}
	
	public void reorder(int[] order) {
		int[] reorder = new int[8];
		reorder[0] = order[7];
		for(int i = 1; i < 8; i++) {
			reorder[i] = order[i-1];
		}
		Slides[] reSlider = new Slides[8]
	}
	
	
	
}
