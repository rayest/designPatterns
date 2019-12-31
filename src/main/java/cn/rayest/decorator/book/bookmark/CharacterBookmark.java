package cn.rayest.decorator.book.bookmark;

import cn.rayest.decorator.book.BookmarkDecorator;
import cn.rayest.decorator.book.Book;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
public class CharacterBookmark extends BookmarkDecorator {
    Book book;

    public CharacterBookmark(Book book){
        this.book = book;
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", characterBookmark ";
    }

    @Override
    public double cost() {
        return 1 + book.cost();
    }
}
