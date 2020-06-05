package service;

import persistence.BookDAO;

public class BookDeleteService {
	public int deleteBook(String code) {
		BookDAO dao = new BookDAO();
		return dao.deleteBook(code);
	}
}
