package ru.dev.study.bpm.bet.adviser.delegate.messaging;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.dev.study.bpm.bet.adviser.service.messaging.ErrorEventProducer;

@Component
@RequiredArgsConstructor
public class ErrorMessageEventSenderDelegate implements JavaDelegate {
    private final ErrorEventProducer errorEventProducer;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        errorEventProducer.send(null);
    }
}
