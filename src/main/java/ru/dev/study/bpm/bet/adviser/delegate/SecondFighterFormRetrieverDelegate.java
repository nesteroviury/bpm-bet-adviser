package ru.dev.study.bpm.bet.adviser.delegate;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.dev.study.bpm.bet.adviser.common.ContextVariables;
import ru.dev.study.bpm.bet.adviser.common.ErrorConstants;

import java.util.Random;

@Component
public class SecondFighterFormRetrieverDelegate implements JavaDelegate {
    private static final Random RANDOM = new Random();

    @Override
    public void execute(DelegateExecution execution) throws Exception {
//        int victoryCount = RANDOM.nextInt(29) + 1;
//        int defeatCount = RANDOM.nextInt(29) + 1;
//        if (victoryCount + defeatCount > 30) {
            String errorMessage = String.format(ErrorConstants.ERROR_MESSAGE_TEMPLATE, 25, 25);
            throw new BpmnError(ContextVariables.ERROR_MESSAGE, errorMessage);
//        }
//        double form = ((double) victoryCount) / defeatCount * 100;
//        execution.setVariable(ContextVariables.SECOND_FIGHTER_FORM, form);
    }
}
