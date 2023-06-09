package ru.kpfu.itis.vaihdass.ConsoleMvccmIO.implementation;

import ru.kpfu.itis.vaihdass.ConsoleMvccmIO.abstractions.Output;
import ru.kpfu.itis.vaihdass.ConsoleMvccmIO.structures.Response;

public class ConsoleOutput implements Output {
    @Override
    public void updateView(Response response) throws IllegalArgumentException {
        if (response == null || response.getOutput() == null) throw new IllegalArgumentException("Response output can't be null.");

        if (response.isLinebreakAfter()) {
            System.out.println(response.getOutput());
        } else {
            System.out.print(response.getOutput());
        }
    }
}
