package ru.dev.study.bpm.bet.adviser.api.async.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorEvent {
    private String message;
}
