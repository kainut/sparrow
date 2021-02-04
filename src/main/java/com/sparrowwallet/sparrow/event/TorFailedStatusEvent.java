package com.sparrowwallet.sparrow.event;

public class TorFailedStatusEvent extends TorStatusEvent {
    private final Throwable exception;

    public TorFailedStatusEvent(Throwable exception) {
        super("Tor failed to start: " + (exception.getCause() != null ?
                (exception.getCause().getMessage().contains("Failed to bind") ? exception.getCause().getMessage() + " Is a Tor proxy already running?" : exception.getCause().getMessage() ) :
                exception.getMessage()));
        this.exception = exception;
    }

    public Throwable getException() {
        return exception;
    }
}
