package net.twisteddna.base;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
public class Note {
    @Id
    public String id;
    public String topic;
    public String text;

    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", topic='" + topic + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
