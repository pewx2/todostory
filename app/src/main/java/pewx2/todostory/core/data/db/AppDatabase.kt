package pewx2.todostory.core.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import pewx2.todostory.core.data.db.dao.TasksDao
import pewx2.todostory.core.data.db.entity.TaskEntity

@Database(entities = [TaskEntity::class], version = 1, exportSchema = true)
@TypeConverters(Converters::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun taskDao(): TasksDao
}