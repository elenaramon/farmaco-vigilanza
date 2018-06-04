package us.rst.farmacovigilanza.repositories;

import android.arch.lifecycle.LiveData;
import java.util.List;

import us.rst.farmacovigilanza.database.AppDatabase;
import us.rst.farmacovigilanza.database.entity.DoctorEntity;
import us.rst.farmacovigilanza.models.Doctor;

/**
 * Gestisce le interrogazioni al database per il dominio dei dottori
 */
public class DoctorsRepository extends BaseRepository {
    /**
     * Inizializza una nuova istanza di questa classe
     * @param database un'istanza di {@link AppDatabase}
     */
    public DoctorsRepository(AppDatabase database) {
        super(database);
    }

    /**
     * Restituisce il dottore date le credenziali di accesso al sistema
     * @param id id dottore
     * @return un'istanza di {@link Doctor} se il dottore esiste; altrimenti null
     */
    public LiveData<DoctorEntity> getDoctor(String id) {
        return getDatabase().doctorsDao().getDoctor(id);
    }
}
