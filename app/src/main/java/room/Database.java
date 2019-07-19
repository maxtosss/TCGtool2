package room;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;



@android.arch.persistence.room.Database(entities = {CardEntity.class}, version = 2)
@TypeConverters({ArrayTypeConverter.class})
public abstract class Database extends RoomDatabase
{
    public abstract CardDAO cardDAO();

    private static  Database instance;

    public static synchronized Database getInstance(Context context){
        if (instance ==null) {
            instance = Room.databaseBuilder(context,
                    Database.class, "card_db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();

        }
         return instance;
    }
    public Database getDatabase() {return instance;}



}
