import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class tester {




public void output(Sets collection[]) throws IOException {
	BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
	for(int i=0; i < collection.length; i++) {
		Sets temp = collection[i];
		Slides[] slides = temp.getSlides();
		for(int x = 0; x < 8; x++) {
			//True when slide is horizontal, e.g one image per slide
			if(!slides[x].getPic().getVector()) {
				writer.wrtie(slides[x].getPic[0].getIndex());
			}else {
				writer.write(slides[x].getPic[0].getIndex() + slides[x].getPic[1].getIndex());
				}
			}
		}
	}
}