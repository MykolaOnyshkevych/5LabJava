package ua.lviv.iot.gym.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.lviv.iot.gym.model.CardioZoneMachine;;

@Repository
public interface ExerciseMachineRepository extends JpaRepository<CardioZoneMachine, Integer> {
}
