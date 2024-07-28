package creational.abstractFactory;

public class BuildMuscleFactory implements GoalsFactory{
    @Override
    public MealPlan getMealPlan() {
        return new BuildMuscleMealPlan();
    }

    @Override
    public WorkoutPlan getWorkoutPlan() {
        return new BuildMuscleWorkout();
    }
}
