# PureImage
一个快速创建纯色壁纸的方式，提供两种版式，

* 无字版
* 有字版

效果图如下

![晴山蓝无字]("https://github.com/lyflipped/PureImage/blob/master/static/notitle/%E6%99%B4%E5%B1%B1%E8%93%9D.jpg?raw=true")

![晴山蓝有字]("https://github.com/lyflipped/PureImage/blob/master/static/withtitle/%E6%99%B4%E5%B1%B1%E8%93%9D.jpg?raw=true")
## 什么是中国色？

厌倦了壁纸的画画绿绿，决定回归纯色。

偶然间发现一个中国纯色网站，颜色十分耐看而且素雅，鉴于网上找不
到合适的纯色壁纸，决定自己制作。

纯色网站奉上，大家可以自行挑选喜欢的颜色。

> **http://zhongguose.com/#**


## 如何自己创建纯色壁纸呢？

### 1、自定义颜色和手机型号
只需要修改PureImageUtil类中的颜色列表即可，
在上述网站中找到喜欢的颜色，然后创建一个PureColor对象，添加到pureColors这个List中去，这个List中的所有颜色都将在程序运行之后生成对应的壁纸。

**注意：** 不同型号的手机像素不同，大家可以在List<PhoneStyle>中创建自己的手机型号，然后系统会自动生成相应的目录。

```java
public class PureImageUtil {
	public static List<PureColor> pureColors = new ArrayList<PureColor>();
	public static List<PhoneStyle> styles = new ArrayList<>();
	static{
		pureColors.add(new PureColor("玉簪绿", new Color(164,202,182), Color.white, "a4cab6"));
		pureColors.add(new PureColor("晴山蓝", new Color(143,178,201), Color.white, "8fb2c9"));
		pureColors.add(new PureColor("宝石蓝", new Color( 36,134,185), Color.white, "2486b9"));
		pureColors.add(new PureColor("竹绿", new Color(27,167,132), Color.white, "1ba784"));
		pureColors.add(new PureColor("月影白", new Color(192,196,195), Color.white, "c0c4c3"));
		pureColors.add(new PureColor("姜黄", new Color(226,192,39), Color.white, "e2c027"));
		pureColors.add(new PureColor("雁灰", new Color(128,118,110), Color.white, "80766e"));
		pureColors.add(new PureColor("莓酱红", new Color(250,93,25), Color.white, "fa5d19"));
		pureColors.add(new PureColor("曲红", new Color(240,90,70), Color.white, "f05a46"));
		pureColors.add(new PureColor("桔梗紫", new Color(129,60,133), Color.white, "813c85"));
		
		styles.add(new PhoneStyle("小米9", 1080, 2340));
		styles.add(new PhoneStyle("通用", 1080, 1920));
	}

}
```

### 2、运行程序

设置一个壁纸生成的主目录,自定义commonPath即可。
```java
String commonPath = "D:\\testImage";
```
然后直接运行main方法，即可得到壁纸。
