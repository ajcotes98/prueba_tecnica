package com.saucedemo.interactions;

import net.serenitybdd.markers.CanBeSilent;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.concurrent.TimeUnit;

public class WaitStopInteraction implements Interaction, CanBeSilent {
    private final long timeInSeconds;

    public WaitStopInteraction(long timeInSeconds) { this.timeInSeconds = timeInSeconds; }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(TimeUnit.SECONDS.toMillis(timeInSeconds));
    }

    public static WaitStopInteraction enSegundos(long timeInSeconds) {
        return Tasks.instrumented(WaitStopInteraction.class, timeInSeconds);
    }

    @Override
    public boolean isSilent() {
        return true;
    }
}
