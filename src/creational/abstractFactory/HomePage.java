package creational.abstractFactory;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalsFactory factory) {
        mealPlan = factory.getMealPlan();
        workoutPlan = factory.getWorkoutPlan();
        System.out.println(workoutPlan);
        System.out.println(mealPlan);
    }
}
