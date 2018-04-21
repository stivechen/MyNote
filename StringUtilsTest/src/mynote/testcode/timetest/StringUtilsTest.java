package mynote.testcode.timetest;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {

	public static void main(String[] args) {
		Form form = new Form();
		form.setClzz("0506班");
		form.setName("小明");
		form.setParent("老王");
		form.setSex("男");
		form.setTeacher("容嬷嬷");
		long startTime1 = System.currentTimeMillis();
		Method1(form, startTime1);
		long endTime1 = System.currentTimeMillis();
		System.out.println("方法1结束判断："+(endTime1-startTime1)+"ms");
		System.out.println("======================================");
		long startTime2 = System.currentTimeMillis();
		Method1(form, startTime2);
		long endTime2 = System.currentTimeMillis();
		System.out.println("方法2结束判断："+(endTime2-startTime2)+"ms");
		
	}

	private static void Method1(Form form, long startTime) {
		if (StringUtils.isEmpty(form.getClzz())&&StringUtils.isEmpty(form.getName())&&StringUtils.isEmpty(form.getParent())
				&&StringUtils.isEmpty(form.getSex())&&StringUtils.isEmpty(form.getTeacher())) {
			//同时为空
			long emptyTime = System.currentTimeMillis();
			System.out.println("方法1都为空耗时："+(emptyTime-startTime));
		}
	}
	
	private static void Method2(Form form, long startTime) {
		if (StringUtils.isEmpty(form.getClzz())) {
			//同时为空
			long emptyTime = System.currentTimeMillis();
			System.out.println("方法2都为空耗时："+(emptyTime-startTime));
		}
	}
	
}
