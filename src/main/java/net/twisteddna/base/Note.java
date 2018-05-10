package net.twisteddna.base;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Note {
    public String text;

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                '}';
    }
}
