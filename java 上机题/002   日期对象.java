
/**
 * 截取时间字符串:
 * 有这样一个时间字符串：2008-8-8 20:08:08
 * 请编写能够匹配它的正则表达式,并编写Java代码将日期后面的时分秒提取出来，即：20:08:08
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P1 {
	public static void main(String[] args) {
		String date = "2008-8-8 20:08:08";
		String regex = "[0-9]{4}-[0-9]{1}-[0-9]{1} [0-9]{2}:[0-9]{2}:[0-9]{2}";
		boolean b = Pattern.compile(regex).matcher(date).matches();
		System.out.println(b);
		String result = "";
		String regex1 = "[0-9]{2}:[0-9]{2}:[0-9]{2}";
		Matcher matcher = Pattern.compile(regex1).matcher(date);
		if (matcher.find()) {
			result = matcher.group(0);
		}
		System.out.println(result);
	}
}
