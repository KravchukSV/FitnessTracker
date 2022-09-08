package sport;

public class Boxing extends Training {

    public Boxing(double avgHeartRate, double trainingTime, double weightAthletes) {
        super(avgHeartRate, trainingTime, weightAthletes);
    }

    @Override
    public String toString() {
        return "Тренировка по боксу!" +
                " Длительность: " + super.getTrainingTime() + " минут" +
                " Килокалорий: " + super.caloriesBurned();
    }
}
