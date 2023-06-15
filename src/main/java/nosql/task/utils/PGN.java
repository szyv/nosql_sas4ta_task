package nosql.task.utils;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class PGN {

    private String m;
    private int n;
    private String c;
    private String t;
    private PGNEvaluation e;
    private PGNEntry[] s;
    @Data
    public static class PGNEntry {
        private String m;
        private int n;
        private String c;
        private PGNEvaluation e;
        private PGNEntry[] s;
    }
    @Data
    public static class PGNEvaluation {
        private double v;
        private int d;
    }
}
