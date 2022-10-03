package com.gowdham.socialmediaapp.customexception;

import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class ErrorResponse {

    private LocalDateTime errorTimestamp;
    private String errorMessage;
    private String errorDetails;

    public ErrorResponse(LocalDateTime errorTimestamp, String errorMessage, String errorDetails) {
        this.errorTimestamp = errorTimestamp;
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
    }

    public LocalDateTime getErrorTimestamp() {
        return errorTimestamp;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorDetails() {
        return errorDetails;
    }
}
