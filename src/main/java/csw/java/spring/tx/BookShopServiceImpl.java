package csw.java.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unused")
@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {

	@Autowired
	private BookShopDao bookShopDao;

	// @Transactional(propagation = Propagation.REQUIRED)//默认
	// @Transactional(propagation = Propagation.REQUIRES_NEW, isolation =
	// Isolation.READ_COMMITTED, noRollbackFor = {
	// UserAccountException.class })
	@Transactional(readOnly = false, timeout = 1000)
	@Override
	public void purchase(String username, int isbn) {

		int price = bookShopDao.findBookPriceByIsbn(isbn);

		bookShopDao.updateBookStock(isbn);

		bookShopDao.updateUserAccount(username, price);

	}

}
