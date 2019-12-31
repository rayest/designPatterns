package cn.rayest.decorator.book.impl;

import cn.rayest.decorator.book.Book;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
public class Essay extends Book {
  public Essay() {
    description = "Essay";
  }

  @Override
  public double cost() {
    return 10;
  }
}
