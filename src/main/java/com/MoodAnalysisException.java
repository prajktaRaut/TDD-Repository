package com;

public class MoodAnalysisException extends Exception {

    public enum ExceptionType{

        ENTERED_NULL, ENTERED_EMPTY

    }

   public ExceptionType type;

    public MoodAnalysisException(String message, ExceptionType type) {
        super(message);
        this.type=type;
    }

    public MoodAnalysisException(String message) {
        super(message);
    }
}
