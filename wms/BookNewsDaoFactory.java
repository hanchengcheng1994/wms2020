package cn.blb.dao.factory;

import cn.blb.dao.BookNewsDao;
import cn.blb.dao.impl.BookNewsDaoImpl;
/**
 * 
 * 获取一个具体的BookNewsDao得实现类
 *
 */
public class BookNewsDaoFactory {
	
	public static BookNewsDao getInstance(){
		return new BookNewsDaoImpl();
	}
}
