package csw.java.spring.tx;

public interface BookShopDao {

	int findBookPriceByIsbn(int isbn);

	void updateBookStock(int isbn);

	void updateUserAccount(String username, int price);

}
