package nosql.task.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PgnService {

    private final PgnRepository repository;

    @Autowired
    public PgnService(PgnRepository repository) {
        this.repository = repository;
    }

    public List<PGN> getAllChessData() {
        return repository.findAll();
    }

    public List<PGN> getTransformedChessData() {
        List<PGN> chessData = repository.findAll();
        // Transform the PGN to FEN
        return chessData;
    }

    public void saveData(PGN pgn) {
        repository.save(pgn);
    }
}
