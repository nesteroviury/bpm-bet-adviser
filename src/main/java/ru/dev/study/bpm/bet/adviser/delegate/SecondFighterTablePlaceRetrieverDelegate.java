package ru.dev.study.bpm.bet.adviser.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.dev.study.bpm.bet.adviser.common.ContextVariables;

import java.util.Random;

@Component
public class SecondFighterTablePlaceRetrieverDelegate implements JavaDelegate {
    private static final Random RANDOM = new Random();

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        int tablePlace = RANDOM.nextInt(29) + 1;
        execution.setVariable(ContextVariables.SECOND_FIGHTER_TABLE_PLACE, tablePlace);
    }
}
