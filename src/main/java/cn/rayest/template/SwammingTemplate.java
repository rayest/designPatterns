package cn.rayest.template;

public class SwammingTemplate extends ExerciseOperations {

    @Override
    protected void changeClothes() {
        System.out.println("换上泳装");
    }

    @Override
    protected void warmUp() {
        System.out.println("全身热身");
    }
}
