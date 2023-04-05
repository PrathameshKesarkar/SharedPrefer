package co.pratham.mysharedpref.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface PreferenceDao {

    @Query("Select * from KeyEntity where `key` = :key")
    public KeyEntity fetchKey(String key);

    @Insert
    public void insertKey(KeyEntity entity);

    @Query("Delete from KeyEntity where `key`=  :key")
    void deleteKey(String key);

    @Query("Update KeyEntity SET `value` = :value where `key` = :key")
    void updateKey(String key,String value);
}
