package ru.dev.study.bpm.bet.adviser.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.dev.study.bpm.bet.adviser.common.ContextVariables;

@Component
@Slf4j
public class AdvisePrinterDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        double firstFighterVictoryProbability = (double) execution.getVariable(ContextVariables.FIRST_FIGHTER_VICTORY_PROBABILITY);
        double secondFighterVictoryProbability = (double) execution.getVariable(ContextVariables.SECOND_FIGHTER_VICTORY_PROBABILITY);
        StringBuilder stringBuilder = new StringBuilder();
        String advise = stringBuilder.append(ContextVariables.FIRST_FIGHTER_VICTORY_PROBABILITY)
                .append(":")
                .append(firstFighterVictoryProbability)
                .append("\n")
                .append(ContextVariables.SECOND_FIGHTER_VICTORY_PROBABILITY)
                .append(":")
                .append(secondFighterVictoryProbability)
                .toString();
        log.info(advise);
    }
}
