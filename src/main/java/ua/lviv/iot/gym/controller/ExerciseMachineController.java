package ua.lviv.iot.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ua.lviv.iot.gym.business.ExerciseMachineService;
import ua.lviv.iot.gym.model.CardioZoneMachine;

import java.util.List;

@RequestMapping("/racetracks")
@RestController
public class ExerciseMachineController {

    @Autowired
    private ExerciseMachineService  exerciseMachineService;

    @GetMapping
    public final List<CardioZoneMachine> getAllRaceTracks() {
        return exerciseMachineService.getAllRaceTracks();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CardioZoneMachine> getRaceTrack(final @PathVariable("id") Integer id) {
        CardioZoneMachine raceTrackModel;
        return (raceTrackModel = exerciseMachineService.getRaceTrack(id)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(raceTrackModel, HttpStatus.OK);
        
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public final CardioZoneMachine createRaceTrack(final @RequestBody CardioZoneMachine raceTrack) {
        return exerciseMachineService.createRaceTrack(raceTrack);
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity<CardioZoneMachine> deleteRaceTrack(final @PathVariable("id") Integer id) {
       HttpStatus status = exerciseMachineService.deleteRaceTrack(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(status);
    
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<CardioZoneMachine> updateMansion(final @PathVariable("id") Integer id,
            final @RequestBody CardioZoneMachine raceTrack) {
        CardioZoneMachine previonsRaceTrack = exerciseMachineService.updateraceTrack(id, raceTrack);
        return previonsRaceTrack  == null
                ? new ResponseEntity <CardioZoneMachine> (HttpStatus.NOT_FOUND)
                : new ResponseEntity <CardioZoneMachine> (previonsRaceTrack, HttpStatus.OK);
        
    }
        
}