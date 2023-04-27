package pewx2.todostory.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import pewx2.todostory.core.data.db.AppDatabase
import pewx2.todostory.core.data.db.dao.TasksDao

@Module
@InstallIn(ActivityComponent::class)
class DatabaseModule {
    @Provides
    fun provideDataBase(
        @ApplicationContext context: Context
    ): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "db"
    ).build()

    @Provides
    fun provideTasksDao(appDatabase: AppDatabase): TasksDao = appDatabase.taskDao()
}