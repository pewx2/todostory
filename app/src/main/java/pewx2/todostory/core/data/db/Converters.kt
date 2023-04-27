package pewx2.todostory.core.data.db

import androidx.room.TypeConverter
import java.time.Instant

class Converters {
    @TypeConverter
    fun fromInstant(value: Instant?): String? {
        return value?.toString()
    }

    @TypeConverter
    fun stringToInstant(date: String?): Instant? {
        return Instant.parse(date)
    }
}