package cn.rayest.decorator.book.impl;

import cn.rayest.decorator.book.Book;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
public class Novel extends Book {
  public Novel() {
    description = "Novel";
  }

  @Override
  public double cost() {
    return 30;
  }
}
