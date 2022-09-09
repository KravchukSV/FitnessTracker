package sport;

public class Crossfit extends Training{

    private double maxProjectileWeight;

    public Crossfit(double avgHeartRate, double trainingTime, double weightAthletes, double maxProjectileWeight) {
        super(avgHeartRate, trainingTime, weightAthletes);
        this.maxProjectileWeight = maxProjectileWeight;
    }

    @Override
    public String toString() {
        return "Кроссфит тренировка!" +
                " Длительность: " + getTrainingTime() + " минут" +
                " Максимальный вес снаряда: " + maxProjectileWeight + " кг" +
                " Килокалорий: " + caloriesBurned();
    }
}

