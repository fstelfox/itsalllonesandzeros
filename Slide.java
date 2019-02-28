import java.util.Arrays;
import java.util.HashSet;

public class Slide{
    private Image[] pic;
  	private boolean vertical;
  	/**
	 * @return the pic
	 */
	public Image[] getPic() {
		return pic;
	}

	/**
	 * @param pic the pic to set
	 */
	public void setPic(Image[] pic) {
		this.pic = pic;
	}

	/**
	 * @return the vertical
	 */
	public boolean isVertical() {
		return vertical;
	}

	/**
	 * @param vertical the vertical to set
	 */
	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	/**
	 * @return the noTags
	 */
	public int getNoTags() {
		return noTags;
	}

	/**
	 * @param noTags the noTags to set
	 */
	public void setNoTags(int noTags) {
		this.noTags = noTags;
	}

	/**
	 * @return the tags
	 */
	public String[] getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(String[] tags) {
		this.tags = tags;
	}


	private int noTags;
  	private String[] tags;

    Slide(Image img){
      vertical = false;
      pic = img;
      noTags = img.getNumTags();
      tags = img.getTags();
    }

    Slide(Image a, Image b){
      vertical = true;
      pic = new Image[2]();
      pic[0] = a;
      pic[1] = b;

      HashSet<String> set = new HashSet<>();
      set.addAll(Arrays.asList(a.getTags()));
      set.addAll(Arrays.asList(a.getTags()));

      tags = set.toArray(tags);
      noTags = set.size();
    }


    public void compare(Slide a){
      int both = 0, uniqueA = 0, uniqueThis = 0;

      for(int i = 0; i < this.noTags; i++){
        for(int j = 0; j < a.getNoTags(); j++){
          if(this.tags[i].equals(a.getTags()[j])){
            both++;
          }
        }
      }
      uniqueA = a.getNoTags()-both;
      uniqueThis = noTags-both;
      int lowest;
      if(uniqueA<uniqueThis){
        lowest = uniqueA;
      }
      else{
        lowest = uniqueThis;
      }
      if(both<lowest){
        return both;
      }
      else{
        return lowest;
      }
    }
}
