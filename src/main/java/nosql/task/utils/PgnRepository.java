package nosql.task.utils;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PgnRepository extends MongoRepository<PGN, String> {
}
