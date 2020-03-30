package ua.lviv.iot.gym.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.gym.model.AbstractExerciseMachine;;

@RequestMapping("/racetracks")
@RestController
public class ExerciseMachineController {
    private static Map<Integer, AbstractExerciseMachine> racetracks = new HashMap<>();
    private static AtomicInteger counter = new AtomicInteger();

    @GetMapping
    public final List<AbstractExerciseMachine> getRacetrack() {
        return new LinkedList<AbstractExerciseMachine>(racetracks.values());
    }

    @GetMapping(path = "/{id}")
    public final AbstractExerciseMachine getRacetrack(final @PathVariable("id") Integer id) {
        System.out.println(id);
        return racetracks.get(id);
    }

    @PutMapping(path = "{id}")
    public AbstractExerciseMachine putRacetrack(final @PathVariable("id") Integer id,
            final @RequestBody AbstractExerciseMachine racetrack) {
        racetrack.setId(id);
        return racetracks.put(id, racetrack);
    }

    @DeleteMapping(path = "{id}")
    public final ResponseEntity<Object> deleteRacetrack(final @PathVariable("id") Integer id) {
        HttpStatus status = racetracks.remove(id) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

      @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public AbstractExerciseMachine createRaceTrack(final @RequestBody AbstractExerciseMachine racetrackelement) {
        racetrackelement.setId(counter.incrementAndGet());
        racetracks.put(racetrackelement.getId(), racetrackelement);
        return racetrackelement;
    }

}
