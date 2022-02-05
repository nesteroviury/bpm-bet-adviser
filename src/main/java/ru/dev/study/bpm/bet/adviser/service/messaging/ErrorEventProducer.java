package ru.dev.study.bpm.bet.adviser.service.messaging;

import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;
import ru.dev.study.bpm.bet.adviser.api.async.dto.ErrorEvent;

@Service
public class ErrorEventProducer {
    @SendTo(Processor.OUTPUT)
    public ErrorEvent send(String errorMessage) {
        return new ErrorEvent(errorMessage);
    }
}
