package cn.rayest.decorator;

import cn.rayest.decorator.book.Book;
import cn.rayest.decorator.book.Essay;
import cn.rayest.decorator.book.Novel;
import cn.rayest.decorator.book.Poem;
import cn.rayest.decorator.bookmark.CharacterBookmark;
import cn.rayest.decorator.bookmark.SceneryBookmark;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
class Application {
    public static void main(String[] args) {
        Book book1 = new Essay();
        System.out.println(book1.getDescription() + " $" + book1.cost());

        Book book2 = new Poem();
        System.out.println(book2.getDescription() + "  $" + book2.cost());

        Book book3 = new Novel();
        System.out.println(book3.getDescription() + " $" + book3.cost());

        Book book4 = new Essay();
        book4 = new CharacterBookmark(book4);
        System.out.println(book4.getDescription() + " $" + book4.cost());

        Book book5 = new Poem();
        book5 = new CharacterBookmark(book5);
        book5 = new SceneryBookmark(book5);
        System.out.println(book5.getDescription() + " $" + book5.cost());
    }
}
