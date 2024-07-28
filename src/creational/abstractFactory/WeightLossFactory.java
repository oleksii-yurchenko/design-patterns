package creational.abstractFactory;

public class WeightLossFactory implements GoalsFactory{
    @Override
    public MealPlan getMealPlan() {
        return new WeighLossMealPlan();
    }

    @Override
    public WorkoutPlan getWorkoutPlan() {
        return new WeightLossWorkout();
    }
}
