package us.rst.farmacovigilanza.repositories;

import us.rst.farmacovigilanza.database.AppDatabase;

/**
 * Handles database queries
 */
public class ReportsRepository extends BaseRepository {
    /**
     * Initializes a new instance of this class
     * @param database an instance of {@link AppDatabase}
     */
    public ReportsRepository(AppDatabase database) {
        super(database);
    }
}