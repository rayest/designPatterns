package cn.rayest.decorator.book;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
public class Poem extends Book{
    public Poem(){
        description = "Poem";
    }

    @Override
    public double cost() {
        return 20;
    }
}
