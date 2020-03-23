package ua.lviv.iot.gym.manager;

import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.gym.model.AbstractExerciseMachine;
import ua.lviv.iot.gym.model.SortType;

public class GymManagerUtils {
//new static country comparator
    private static final ProducingCountryComparator COUNTRY_COMPARATOR = new GymManagerUtils().new ProducingCountryComparator();

    public static void sortByCountryProducing(List<AbstractExerciseMachine> exerciseMachine, SortType sortType) {
        exerciseMachine.sort(sortType == SortType.ASCENDING ? COUNTRY_COMPARATOR : COUNTRY_COMPARATOR.reversed());
    }

//static inner class
    private static final PricePerHourComparator PRICE_COMPARATOR = new PricePerHourComparator();

    private static class PricePerHourComparator implements Comparator<AbstractExerciseMachine> {

        @Override
        public int compare(AbstractExerciseMachine exerciseMachineFirst,
                AbstractExerciseMachine exerciseMachineSecond) {
            return (int) (exerciseMachineFirst.getPricePerHour() - exerciseMachineSecond.getPricePerHour());
        }
    }

    public static void sortExerciseMachinesByPriceDes(List<AbstractExerciseMachine> exerciseMachine,
            SortType sortType) {

        exerciseMachine.sort(sortType == SortType.DESCENDING ? PRICE_COMPARATOR : PRICE_COMPARATOR.reversed());
    }

//inner class
    // Should be static to not create an instance of an external class
    private class ProducingCountryComparator implements Comparator<AbstractExerciseMachine> {

        @Override
        public int compare(AbstractExerciseMachine exerciseMachineFirst,
                AbstractExerciseMachine exerciseMachineSecond) {
            return (int) exerciseMachineFirst.getProducingCountry()
                    .compareTo(exerciseMachineSecond.getProducingCountry());
        }

    }

    public static void sortByProducingCountryAsc(List<AbstractExerciseMachine> exerciseMachines, SortType sortType) {
        exerciseMachines.sort(sortType == SortType.ASCENDING ? new GymManagerUtils().new ProducingCountryComparator()
                : new GymManagerUtils().new ProducingCountryComparator().reversed());
    }

    // anonymous inner class
    public static void sortByModelAsc(List<AbstractExerciseMachine> exerciseMachine, SortType sortType) {
        Comparator<AbstractExerciseMachine> modelComparator = new Comparator<AbstractExerciseMachine>() {

            @Override
            public int compare(AbstractExerciseMachine exerciseMachineFirst,
                    AbstractExerciseMachine exerciseMachineSecond) {
                return (int) (exerciseMachineFirst.getModel().compareTo(exerciseMachineSecond.getModel()));
            }

        };

        exerciseMachine.sort(sortType == SortType.ASCENDING ? modelComparator : modelComparator.reversed());
    }

    // lambda
    public static void sortExerciseMachinesByDurationDes(List<AbstractExerciseMachine> exerciseMachines,
            SortType sortType) {
        if (sortType == SortType.DESCENDING) {
            exerciseMachines.sort((exerciseMachineFirst, exerciseMachineSecond) -> Double.compare(
                    exerciseMachineFirst.getDurationInMinutes(), exerciseMachineSecond.getDurationInMinutes()));
        } else {
            exerciseMachines.sort((exerciseMachineFirst, exerciseMachineSecond) -> Double.compare(
                    exerciseMachineSecond.getDurationInMinutes(), exerciseMachineFirst.getDurationInMinutes()));
        }

    }

}
