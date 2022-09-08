import sport.Boxing;
import sport.Crossfit;
import sport.Running;
import sport.Training;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {
    public static void main(String[] args) {

        List<Training> trainingList = new ArrayList<>();
        trainingList.add(new Running(145, 60, 70, 10));
        trainingList.add(new Running(170, 20, 70, 5));
        trainingList.add(new Crossfit(195, 50, 70, 90));
        trainingList.add(new Boxing(150, 120, 70));

        for(Training training : trainingList){
            System.out.println(training);
        }

    }
}