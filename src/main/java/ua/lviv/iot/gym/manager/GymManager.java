package ua.lviv.iot.gym.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.gym.model.AbstractExerciseMachine;

public class GymManager {

	private List<AbstractExerciseMachine> exerciseMachineList = new LinkedList<>();

	public GymManager(List<AbstractExerciseMachine> exerciseMachineList) {
		this.exerciseMachineList = exerciseMachineList;
	}

	public GymManager() {
	}

	public void addExerciseToProgram(AbstractExerciseMachine exerciseMachine) {
		this.exerciseMachineList.add(exerciseMachine);
	}

	public void addAllExercisesToProgram(List<AbstractExerciseMachine> exerciseMachineList) {
		this.exerciseMachineList.addAll(exerciseMachineList);
	}

	public List<AbstractExerciseMachine> findExerciseByDuration(double appropriateDurationInMinutes) {
		List<AbstractExerciseMachine> foundedExerciseByDuration = new LinkedList<>();
		for (AbstractExerciseMachine exercise : exerciseMachineList) {
			if (exercise.getDurationInMinutes() == appropriateDurationInMinutes) {
				foundedExerciseByDuration.add(exercise);
			}
		}
		return foundedExerciseByDuration;
	}

	public List<AbstractExerciseMachine> findExerciseByLowerPrice(double appropriatePricePerHour) {
		List<AbstractExerciseMachine> foundedExerciseByLowerPrice = new LinkedList<>();
		for (AbstractExerciseMachine exercise : exerciseMachineList) {
			if (exercise.getPricePerHour() < appropriatePricePerHour) {
				foundedExerciseByLowerPrice.add(exercise);
			}
		}
		return foundedExerciseByLowerPrice;
	}

}