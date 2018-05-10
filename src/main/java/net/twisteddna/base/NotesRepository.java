package net.twisteddna.base;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotesRepository extends MongoRepository<Note,String> {
}
