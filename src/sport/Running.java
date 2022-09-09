package sport;

public class Running extends Training{
    private double distance;

    public Running(double avgHeartRate, double trainingTime, double weightAthletes, double distance) {
        super(avgHeartRate, trainingTime, weightAthletes);
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Беговая тренировка!" +
                " Длительность: " + getTrainingTime() + " минут" +
                " Дистанция: " + distance + " км" +
                " Килокалорий: " + caloriesBurned();
    }
}
