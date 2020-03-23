package ua.lviv.iot.gym;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.gym.model.AbstractExerciseMachine;
import ua.lviv.iot.gym.model.Grief;
import ua.lviv.iot.gym.model.Barbell;
import ua.lviv.iot.gym.model.RaceTrack;

public abstract class BaseExerciseMachineManagerTest {
    protected List<AbstractExerciseMachine> exerciseMachines;

    @BeforeEach
    public void createExerciseProgram() {
        exerciseMachines = new LinkedList<AbstractExerciseMachine>();
        exerciseMachines.add(new Grief(125, 84, "USSR", "Beria-2000", 11, 12, 6));
        exerciseMachines.add(new Barbell(55, 78, "China", "Chin-Chong", 78, 56));
        exerciseMachines.add(new RaceTrack(25, 12, "Christiania", "G-13", 6, 23));
    }

}