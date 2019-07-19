package room;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface CardDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(CardEntity cardEntity);

    @Query("SELECT * FROM CardEntity")
    List<CardEntity> getAllcard();
}

