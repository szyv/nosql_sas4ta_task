package nosql.task.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PgnController {

    private final PgnService pgnService;

    @Autowired
    public PgnController(PgnService pgnService) {
        this.pgnService = pgnService;
    }

    @GetMapping("/base")
    public List<PGN> getBaseData() {
        return pgnService.getAllChessData();
    }

    @GetMapping("/fenbase")
    public List<PGN> getTransformedData() {
        return pgnService.getTransformedChessData();
    }

    @PostMapping(value = "/upload", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> savePgn(@RequestBody PGN pgn) {
        pgnService.saveData(pgn);
        return ResponseEntity.status(HttpStatus.CREATED).body("PGN saved successfully.");
    }
}
