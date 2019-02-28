import java.util.Arrays;
import java.util.HashSet;

public class Slide{
    private Image[] pic;
  	private boolean verticle;
  	private int noTags;
  	private String[] tags;

    Slide(Image img){
      vertical = false;
      pic = img;
      noTags = img.getNoTags();
      tags = img.getTags();
    }

    Slide(Image a, Image b){
      vertical = true;
      pic = {a,b};

      HashSet<String> set = new HashSet<>();
      set.addAll(Arrays.asList(a.getTags()));
      set.addAll(Arrays.asList(a.getTags()));

      tags = set.toArray(tags);
      noTags = set.size();
    }


    public int compare(Slide a){
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

    }








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
  	 * @return the verticle
  	 */
  	public boolean isVerticle() {
  		return verticle;
  	}
  	/**
  	 * @param verticle the verticle to set
  	 */
  	public void setVerticle(boolean verticle) {
  		this.verticle = verticle;
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
}
