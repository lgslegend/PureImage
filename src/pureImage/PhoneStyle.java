package pureImage;
/**
 * �ֻ��ͺ�
 * @author liyang
 * @version 2019��10��25�� ����7:29:43
 */
public class PhoneStyle {
	/**
	 * �ֻ��ͺ�
	 */
	private String name;
	/**
	 * ���ؿ��
	 */
	private int width;
	/**
	 * ���ظ߶�
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
