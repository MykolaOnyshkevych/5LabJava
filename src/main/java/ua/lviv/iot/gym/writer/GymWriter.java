package ua.lviv.iot.gym.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import ua.lviv.iot.gym.model.AbstractExerciseMachine;

public class GymWriter {
    private Writer csvWriter;

    public void setWriter(Writer writer) {
        this.csvWriter = writer;
    }

  /*  public void writeToFile(List<AbstractExerciseMachine> exerciseMachines) throws IOException {
        String textToWrite;
        for (AbstractExerciseMachine exerciseMachine : exerciseMachines) {
            textToWrite = exerciseMachine.getHeaders() + ", " + exerciseMachine.toCSV() + "\r\n";
            csvWriter.write(textToWrite);
        }
        csvWriter.flush();
    }*/

    public String toString() {
        return csvWriter.toString();
    }
}
