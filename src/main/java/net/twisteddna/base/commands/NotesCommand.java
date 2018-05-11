package net.twisteddna.base.commands;

import lombok.Data;

@Data
public class NotesCommand {
    public String addNoteTextValue;
    public String addNoteTopicValue;
    public String noteIdToDelete;
}
