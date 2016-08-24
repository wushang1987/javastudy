import java.util.Date;
import java.util.Properties;

public class Property {
	public static void main(String[] args) {
		//返回当前时间
		System.out.println(new Date());
		
		//将属性表输出到指定的System.out 输出流
		Properties p = System.getProperties();
		p.list(System.out);
		
		
		System.out.println("--- Memory Usage:");
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory = "
		+ rt.totalMemory()
		+ " Free Memory = "
		+ rt.freeMemory());
		}
}
