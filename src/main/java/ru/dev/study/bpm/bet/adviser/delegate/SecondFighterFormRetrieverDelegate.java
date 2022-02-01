package ru.dev.study.bpm.bet.adviser.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.dev.study.bpm.bet.adviser.common.ContextVariables;

import java.util.Random;

@Component
public class SecondFighterFormRetrieverDelegate implements JavaDelegate {
    private static final Random RANDOM = new Random();

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        int victoryCount = RANDOM.nextInt(29) + 1;
        int defeatCount = RANDOM.nextInt(29) + 1;
//        if(victoryCount+defeatCount > 30){
        //todo: throw and catch exception
//        }
        double form = ((double) victoryCount) / defeatCount * 100;
        execution.setVariable(ContextVariables.SECOND_FIGHTER_FORM, form);
    }
}
