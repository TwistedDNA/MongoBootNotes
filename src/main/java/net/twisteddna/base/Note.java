package net.twisteddna.base;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Note {
    @Id
    public String id;
    public String text;

    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
