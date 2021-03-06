package ua.lviv.iot.gym.manager;

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
        List<AbstractExerciseMachine> exerciseMachines = gymManager.findExerciseByDuration(45);
       /* assertEquals(3, exerciseMachines.size());
        assertEquals(84, exerciseMachines.get(0).getDurationInMinutes());
        assertEquals(78, exerciseMachines.get(1).getDurationInMinutes());
        assertEquals(12, exerciseMachines.get(2).getDurationInMinutes());*/
    }
}
