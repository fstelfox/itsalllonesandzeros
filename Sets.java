import java.util.Arrays;
import java.util.Random;

public class Sets {

	Slide slides[8];

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
		Slides oldSlides[8];
		for(int i = 0; i < 8; i++){
			oldSlides[i] = slides[i];
		}
		for(int i = 0; i < 8; i++){
			slides[order[i]] = oldSlides[i];
		}
	}

	public int score(int[] order){
		int score = 0;
		for(int i = 0; i < 7; i++){
			score += slides[i].compare(slides[i+1]);
		}
		return score;
	}



}
