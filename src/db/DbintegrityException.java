package db;

import java.io.Serial;

public class DbintegrityException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DbintegrityException(String msg) {
        super(msg);
    }
}
