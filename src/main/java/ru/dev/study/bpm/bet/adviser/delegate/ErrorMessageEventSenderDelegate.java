package ru.dev.study.bpm.bet.adviser.delegate;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.dev.study.bpm.bet.adviser.common.ContextVariables;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ErrorMessageEventSenderDelegate implements JavaDelegate {
    private final RuntimeService runtimeService;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Map<String, Object> variables = new HashMap<>();
        variables.put(ContextVariables.ERROR_MESSAGE, execution.getVariable(ContextVariables.ERROR_MESSAGE));
        runtimeService.startProcessInstanceByMessage(ContextVariables.ERROR_MESSAGE, UUID.randomUUID().toString(), variables);
    }
}
