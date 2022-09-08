package sport;

public abstract class Training {
    private double avgHeartRate;
    private double trainingTime;
    private double weightAthletes;

    protected Training(double avgHeartRate, double trainingTime, double weightAthletes) {
        this.avgHeartRate = avgHeartRate;
        this.trainingTime = trainingTime;
        this.weightAthletes = weightAthletes;
    }

    public double caloriesBurned(){
        return 0.014 * weightAthletes * trainingTime * (0.12 * avgHeartRate - 7);
    }

    public double getTrainingTime() {
        return trainingTime;
    }

    @Override
    public abstract String toString();
}

