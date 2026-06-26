public enum PassStatus {
    PASSED("합격"),
    FAILED("불합격");

    private final String passStatus;

    PassStatus(String passStatus) {
        this.passStatus = passStatus;
    }

    public String getPassStatus() {
        return passStatus;
    }
}
