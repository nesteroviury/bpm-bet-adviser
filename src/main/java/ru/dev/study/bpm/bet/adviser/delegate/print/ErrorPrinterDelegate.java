package ru.dev.study.bpm.bet.adviser.delegate.print;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.dev.study.bpm.bet.adviser.common.ContextVariables;

@Component
@Slf4j
public class ErrorPrinterDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.error("{}", execution.getVariable(ContextVariables.ERROR_MESSAGE));
    }
}
