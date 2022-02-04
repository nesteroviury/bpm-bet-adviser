package ru.dev.study.bpm.bet.adviser.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.dev.study.bpm.bet.adviser.common.ContextVariables;

@Component
public class AdviseBuilderDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        double firstFighterVictoryProbability = 0;
        double secondFighterVictoryProbability = 0;
        double firstFighterForm = (double) execution.getVariable(ContextVariables.FIRST_FIGHTER_FORM);
        double secondFighterForm = (double) execution.getVariable(ContextVariables.SECOND_FIGHTER_FORM);
        int firstFighterTablePlace = (int) execution.getVariable(ContextVariables.FIRST_FIGHTER_TABLE_PLACE);
        int secondFighterTablePlace = (int) execution.getVariable(ContextVariables.SECOND_FIGHTER_TABLE_PLACE);

        firstFighterVictoryProbability += compareForm(firstFighterForm, secondFighterForm);
        secondFighterVictoryProbability += compareForm(secondFighterForm, firstFighterForm);
        firstFighterVictoryProbability += compareTablePlace(firstFighterTablePlace, secondFighterTablePlace);
        secondFighterVictoryProbability += compareTablePlace(secondFighterTablePlace, firstFighterTablePlace);

        execution.setVariable(ContextVariables.FIRST_FIGHTER_VICTORY_PROBABILITY, firstFighterVictoryProbability);
        execution.setVariable(ContextVariables.SECOND_FIGHTER_VICTORY_PROBABILITY, secondFighterVictoryProbability);
    }

    private double compareForm(double firstParam, double secondParam) {
        double result = 0;
        if (firstParam > secondParam) {
            result = 50;
        } else if (firstParam < secondParam) {
            result = 5;
        } else {
            result = 25;
        }
        return result;
    }

    private double compareTablePlace(int firstParam, int secondParam) {
        double result = 0;
        if (firstParam > secondParam) {
            result = 50;
        } else if (firstParam < secondParam) {
            result = 5;
        } else {
            //todo: throw and catch exception
        }
        return result;
    }
}
