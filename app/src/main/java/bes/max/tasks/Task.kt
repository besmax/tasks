package bes.max.tasks

data class Task (
    var taskId: Long = 0L,
    var taskName: String = "",
    var taskDone: Boolean = false
)
