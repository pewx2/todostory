package pewx2.todostory.core.data.model

import pewx2.todostory.core.UUID
import pewx2.todostory.core.data.db.entity.TaskStatus
import java.time.Instant

/**
 * Model for external layers
 */
data class Task(
    val id: UUID,
    val title: String,
    val status: TaskStatus,
    val createdDateTime: Instant,
    val updatedDateTime: Instant?,
    val completedDateTime: Instant?,
)