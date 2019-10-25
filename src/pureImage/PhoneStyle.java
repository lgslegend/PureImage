package pureImage;
/**
 * 手机型号
 * @author liyang
 * @version 2019年10月25日 下午7:29:43
 */
public class PhoneStyle {
	/**
	 * 手机型号
	 */
	private String name;
	/**
	 * 像素宽度
	 */
	private int width;
	/**
	 * 像素高度
	 */
	private int height;
	
	public PhoneStyle(String name, int width, int height) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "PhoneStyle [name=" + name + ", width=" + width + ", height=" + height + "]";
	}
	
}
