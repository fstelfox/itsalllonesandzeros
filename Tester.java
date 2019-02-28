
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Tester {
	private int noImages;
	private String[] tags;
	private int noTags;
	private Image tempVertical;
	private int noOfSlides;
	
	


	private boolean vertical;
	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Tester tester = new Tester();
		
		
		tester.readInput();
		
		Sets[] sets = new Sets[(int) Math.ceil((tester.getNoImages())/8)];


	}
	
	public int getNoImages() {
		return noImages;
	}
	
	
	public void readInput()
	{
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader("a_example.txt");
			
			
			bufferedReader = new BufferedReader(fileReader);
			
			String nextLine = bufferedReader.readLine();
			
			
			noImages = Integer.parseInt(nextLine);
			
			System.out.println("Number of images: " + noImages);
			nextLine = bufferedReader.readLine();
			while (nextLine != null)
			{
				
				String[] parts = nextLine.split(" ");
				if(parts[0].equals("V"))
				{
					vertical = true;
					System.out.println("vertical");
				}
				else
				{
					vertical = false;
					System.out.println("horizontal");
				}
				
				noTags = Integer.parseInt(parts[1]);
				System.out.println("Number of tags: " + noTags);
				tags = new String[noTags];
				for(int i = 0; i<noTags; i++)
				{
					
					tags[i] = parts[i+2];
					System.out.println("tag " + (i+1) + ": " + tags[i]);
				}
				Image image = new Image(noTags, tags, vertical);
				
				nextLine = bufferedReader.readLine();
				
			}
			
			
			bufferedReader.close();
			
		} catch (IOException error)
		{
			System.out.println("Error reading from file: " + error);
		}
		
	}
	
	public void verticalImage(Image img)
	{
		if(tempVertical == null)
		{
			tempVertical = img;
		}
		else
		{
			Slide slide = new Slide(tempVertical, img);
		}
	}
	
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
