package ua.lviv.iot.gym;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.gym.manager.GymManager;
import ua.lviv.iot.gym.model.AbstractExerciseMachine;

	public class GymManagerTest extends BaseExerciseMachineManagerTest {
		private GymManager gymManager;
		
		@BeforeEach
		public void setUp() {
			gymManager = new GymManager();
			gymManager.addAllExercisesToProgram(exerciseMachines);
			}

		@Test
		public void testFindExerciseByDurationInMinutes() {
			List<AbstractExerciseMachine> exercises = gymManager.findExerciseByDuration(45);
	/*	assertEquals(3, exercises.size());
			assertEquals(84, exercises.get(0).getDurationInMinutes());
			assertEquals(78, exercises.get(1).getDurationInMinutes());
			assertEquals(12, exercises.get(2).getDurationInMinutes());*/
            }
	}

