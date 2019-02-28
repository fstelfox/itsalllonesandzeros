
public class Image {
	

	private int numTags;
	private String[] tags;
	private boolean vertical;
	
	public Image(int numTags, String[] tags, boolean vertical)
	{
		this.numTags = numTags;
		this.tags = tags;
		this.vertical = vertical;
	}

	/**
	 * @return the numTags
	 */
	public int getNumTags() {
		return numTags;
	}

	/**
	 * @param numTags the numTags to set
	 */
	public void setNumTags(int numTags) {
		this.numTags = numTags;
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

}

