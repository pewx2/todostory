package pewx2.todostory.core.domain

import androidx.room.Database
import androidx.room.RoomDatabase
import pewx2.todostory.core.data.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun taskDao(): TasksDao
}