package pureImage;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GeneratePureImage {
	/**
	 * 生成不带文字的纯色图片
	 * @param style 手机型号
	 * @param pureColor 纯色颜色
	 * @param filePrefix 地址前缀
	 * @param picType 文件类型
	 * @return 是否成功
	 */
	public static boolean pureColorPictureNoTitle(PhoneStyle style,PureColor pureColor,String filePrefix,String picType) {
	 	boolean flag = false;
		try {
			//创建一个图像
			BufferedImage img = new BufferedImage(style.getWidth(), style.getHeight() , BufferedImage.TYPE_INT_RGB);
			//取得图形
			Graphics g = img.getGraphics();
			//设置颜色
			g.setColor(pureColor.getColor());
			//填充背景色
			g.fillRect(0, 0, img.getWidth(), img.getHeight());
			
			File f1 = new File(filePrefix+"\\notitle");
			if (!f1.exists()) {
				f1.mkdirs();
			}
			File file = new File(f1,pureColor.getName()+"."+picType);
			ImageIO.write(img, picType, file);
			flag = true;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	 	return flag;	 	
	 }
	/**
	 * 带颜色名称的纯色壁纸
	 * @param style 手机型号
	 * @param pureColor 纯色颜色
	 * @param file 文件地址
	 * @param picType 文件类型
	 * @return 是否成功
	 */
	public static boolean pureColorPictureWithTitle(PhoneStyle style,PureColor pureColor,String filePrefix,String picType) {
	 	boolean flag = false;
	 	
		try {
			//创建一个图像
			BufferedImage img = new BufferedImage(style.getWidth(), style.getHeight() , BufferedImage.TYPE_INT_RGB);
			//取得图形
			Graphics g = img.getGraphics();
			//设置颜色
			g.setColor(pureColor.getColor());
			//填充背景色
			g.fillRect(0, 0, img.getWidth(), img.getHeight());
			//设置字体
			g.setFont(new Font("隶书",Font.BOLD, 80));
			//设置字体颜色
			g.setColor(pureColor.getFontColor());
			
			String title = pureColor.getName();
			int width = img.getWidth() / 2 - 40;
			int heightStart = img.getHeight() / 3;
			for(int i = 0;i<title.length();i++){
				String word = title.substring(i,i+1);
				g.drawString(word, width, heightStart+i*100);
			}
			File f1 = new File(filePrefix+"\\withtitle");
			if (!f1.exists()) {
				f1.mkdirs();
			}
			File file = new File(f1,pureColor.getName()+"."+picType);
			ImageIO.write(img, picType, file);
			flag = true;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	 	return flag;
	 }
	
	public static void main(String[] args) {
		String picType = "jpg";
		String commonPath = "D:\\testImage";
		for(PhoneStyle style : PureImageUtil.styles){
			String filePrefix = commonPath+"\\"+style.getName();
			File f1 = new File(filePrefix);
			if (!f1.exists()) {
				f1.mkdirs();
			}
			for(PureColor pureColor : PureImageUtil.pureColors){
				boolean flag = GeneratePureImage.pureColorPictureNoTitle(style, pureColor, filePrefix, picType);
				if (flag) {
					System.out.println(pureColor.getName()+"no tilte  Success");
				}else {
					System.out.println(pureColor.getName()+"no tilte  Failure");
				}
				boolean flag2 = GeneratePureImage.pureColorPictureWithTitle(style, pureColor, filePrefix, picType);
				if (flag2) {
					System.out.println(pureColor.getName()+"with tilte  Success");
				}else {
					System.out.println(pureColor.getName()+"with tilte  Failure");
				}
			}
		}
	}
}
