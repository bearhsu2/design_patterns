package com.kuma.command;

public class Patient {
    private boolean vaccinated;
    private boolean verified;
    private boolean inqueried;
    private boolean observed;
    private boolean logged;

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isInqueried() {
        return inqueried;
    }

    public void setInqueried(boolean inqueried) {
        this.inqueried = inqueried;
    }

    public boolean isObserved() {
        return observed;
    }

    public void setObserved(boolean observed) {
        this.observed = observed;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
}
