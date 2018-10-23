package csw.java.spring.tx;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCTest {

	private ApplicationContext ctx;
	private BookShopDao bookShopDao;
	private BookShopService bookShopService;
	private Cashier cashier;

	{
		ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/beans-jdbc.xml");
		bookShopDao = (BookShopDao) ctx.getBean("bookShopDao");
		bookShopService = ctx.getBean(BookShopService.class);
		cashier = ctx.getBean(Cashier.class);
	}

	@Test
	public void test5() {
		cashier.checkout("AA", Arrays.asList(1001, 1002));
	}

	@Test
	public void test4() {
		bookShopService.purchase("AA", 1001);
	}

	@Test
	public void test3() {
		bookShopDao.updateUserAccount("AA", 100);
		;
	}

	@Test
	public void test2() {
		bookShopDao.updateBookStock(1001);
	}

	@Test
	public void test1() {
		System.out.println(bookShopDao.findBookPriceByIsbn(1001));
	}
}
