package cn.rayest.decorator.bookmark;

import cn.rayest.decorator.BookmarkDecorator;
import cn.rayest.decorator.book.Book;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
public class SceneryBookmark extends BookmarkDecorator {
    private Book book;

    public SceneryBookmark(Book book) {
        this.book = book;
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", sceneryBookmark ";
    }

    @Override
    public double cost() {
        return 2 + book.cost();
    }
}
