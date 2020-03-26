package ua.lviv.iot.gym.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.gym.manager.GymManagerUtils;
import ua.lviv.iot.gym.model.SortType;

public class GymManagerUtilsTest extends BaseExerciseMachineManagerTest {
    @Test
    public void testSortByPriceDes() {
        GymManagerUtils.sortExerciseMachinesByDurationDes(exerciseMachines, SortType.DESCENDING);
        assertEquals(25.0, exerciseMachines.get(0).getPricePerHour());
        assertEquals(55.0, exerciseMachines.get(1).getPricePerHour());
        assertEquals(125.0, exerciseMachines.get(2).getPricePerHour());
    }

    @Test
    public void testSortByModelAsc() {
        GymManagerUtils.sortByModelAsc(exerciseMachines, SortType.ASCENDING);
        assertEquals("Beria-2000", exerciseMachines.get(0).getModel());
        assertEquals("Chin-Chong", exerciseMachines.get(1).getModel());
        assertEquals("G-13", exerciseMachines.get(2).getModel());
    }

    @Test
    public void testSortByProducingCountryAsc() {
        GymManagerUtils.sortByProducingCountryAsc(exerciseMachines, SortType.ASCENDING);
        assertEquals("China", exerciseMachines.get(0).getProducingCountry());
        assertEquals("Christiania", exerciseMachines.get(1).getProducingCountry());
        assertEquals("USSR", exerciseMachines.get(2).getProducingCountry());
    }

    @Test
    public void testSortByDurationDes() {
        GymManagerUtils.sortExerciseMachinesByDurationDes(exerciseMachines, SortType.DESCENDING);
        assertEquals(12, exerciseMachines.get(0).getDurationInMinutes());
        assertEquals(78, exerciseMachines.get(1).getDurationInMinutes());
        assertEquals(84, exerciseMachines.get(2).getDurationInMinutes());
    }
}