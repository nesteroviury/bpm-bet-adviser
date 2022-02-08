package ru.dev.study.bpm.bet.adviser.common;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class ErrorConstants {
    public static final String ILLEGAL_FIGHT_COUNT_ERROR_MESSAGE_TEMPLATE = "Sum of victoryCount[%d] and defeatCount[%d] must be 30";
    public static final String ILLEGAL_FIGHTERS_TABLE_PLACE_ERROR_MESSAGE_TEMPLATE = "Fighters can't have same[%d] table place";
}
