package ru.dev.study.bpm.bet.adviser.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class FirstFighterFormRetrieverDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Random random = new Random();
        int victoryCount = random.nextInt(29) + 1;
        int defeatCount = random.nextInt(29) + 1;
//        if(victoryCount+defeatCount > 30){
            //todo: throw and catch exception
//        }
        double form = victoryCount / defeatCount * 100;
        execution.setVariable();
    }
}
