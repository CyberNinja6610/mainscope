package ru.netology.nmedia.model

data class FeedModelState(
    val loading: Boolean = false,
    val error: Boolean = false,
    val refreshing: Boolean = false,
    val retryActionById: Pair<RetryActionsById, Long>? = null,
    val retrySave: Boolean = false
)

enum class RetryActionsById {
    LIKE_BY_ID,
    DISLIKE_BY_ID,
    REMOVE_BY_ID,
}

