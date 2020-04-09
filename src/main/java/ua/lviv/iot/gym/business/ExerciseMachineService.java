package ua.lviv.iot.gym.business;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ua.lviv.iot.gym.dataaccess.ExerciseMachineRepository;
import ua.lviv.iot.gym.model.CardioZoneMachine;

import java.util.List;

@Service
public class ExerciseMachineService {

    
    @Autowired
    private ExerciseMachineRepository  exerciseMachineRepository;

    public List<CardioZoneMachine> getAllRaceTracks() {
        return exerciseMachineRepository.findAll();
    }

    public CardioZoneMachine getRaceTrack(Integer id) {
        if (exerciseMachineRepository.existsById(id)) {
            return exerciseMachineRepository.findById(id).get();
        } else {
            return null;
        }
       
    }

    public CardioZoneMachine createRaceTrack(CardioZoneMachine raceTrack) {
        return exerciseMachineRepository.save(raceTrack);
    }

    public boolean deleteRaceTrack(Integer id) {
        if (exerciseMachineRepository.existsById(id)) {
            exerciseMachineRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public CardioZoneMachine updateraceTrack(Integer id, CardioZoneMachine raceTrack) {
       if (exerciseMachineRepository.existsById(id)) {
            CardioZoneMachine initialRaceTrack = exerciseMachineRepository.findById(id).get();
            exerciseMachineRepository.save(raceTrack);
            return initialRaceTrack;
        } else {
            return null;

    }
    }
        

}