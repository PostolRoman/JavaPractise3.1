class SystemAlert {
    private AlertSeverity severity;
    private String message;
    private int executionCode;
    private String timestamp;
    private String process;

    public SystemAlert(AlertSeverity severity, String message, int executionCode, String timestamp, String process) {
        this.severity = severity;
        this.message = message;
        this.executionCode = executionCode;
        this.timestamp = timestamp;
        this.process = process;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getExecutionCode() {
        return executionCode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getProcess() {
        return process;
    }
}