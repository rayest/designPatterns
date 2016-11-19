package cn.rayest.decorator;

import cn.rayest.decorator.book.Book;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
public abstract class BookmarkDecorator extends Book {
    public abstract String getDescription();
}
