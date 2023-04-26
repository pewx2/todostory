package pewx2.todostory.core.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import pewx2.todostory.core.UUID
import java.time.Instant

enum class TaskStatus { TODO, DONE }

@Entity
data class Task(
    @PrimaryKey val id: UUID,
    val title: String,
    val status: TaskStatus = TaskStatus.TODO,
    val createdDateTime: Instant,
    val updatedDateTime: Instant?,
    val completedDateTime: Instant?,
)
