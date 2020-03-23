package ua.lviv.iot.gym;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.gym.BaseExerciseMachineManagerTest;
import ua.lviv.iot.gym.model.AbstractExerciseMachine;
import ua.lviv.iot.gym.writer.GymWriter;;

public class GymWriterTest extends BaseExerciseMachineManagerTest {

 @Test
public void testFile() throws IOException {
try (Writer fileWriter = new FileWriter("Gym.csv")) {
GymWriter writer = new GymWriter();
writer.setWriter(fileWriter);
writer.writeToFile(exerciseMachines);
}
}
@Test
public void testWriteToFile() throws IOException {
try (Writer csvWriter = new StringWriter()) {
GymWriter writer = new GymWriter();
writer.setWriter(csvWriter);
writer.writeToFile(exerciseMachines);
String expectedString = "";
for (AbstractExerciseMachine exerciseMachine : exerciseMachines) {
expectedString += exerciseMachine.getHeaders() + ", " + exerciseMachine.toCSV() + "\r\n";
}
assertEquals(expectedString, writer.toString());
}
}
}
