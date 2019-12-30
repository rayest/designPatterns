package cn.rayest.template;

public abstract class ExerciseOperations {

    // 基本方法
    protected abstract void changeClothes();

    // 基本方法
    protected abstract void warmUp();

    //  模板方法
    public void doExercise() {
        this.changeClothes();
        this.warmUp();
    }
}
