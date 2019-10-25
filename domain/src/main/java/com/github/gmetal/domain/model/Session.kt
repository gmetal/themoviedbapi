package com.github.gmetal.domain.model

class Session(sessionId: String?, sessionType: Int) {

    var requestToken: String? = null
        private set
    private var mSessionId: String? = null

    private val mRequestTokenExpirationDate: String? = null
    private val mSessionExpirationDate: String? = null

    var sessionType: Int = 0
        private set

    val isInvalidSession: Boolean
        get() = sessionType == INVALID_SESSION_TYPE

    val isGuestSession: Boolean
        get() = sessionType == GUEST_SESSION_TYPE

    val isFullSession: Boolean
        get() = sessionType == FULL_SESSION_TYPE

    var sessionId: String?
        get() = mSessionId
        set(sessionId) {

            mSessionId = sessionId
            sessionType = FULL_SESSION_TYPE
        }

    init {

        if (sessionId != null) {
            mSessionId = sessionId
            this.sessionType = sessionType
        } else {
            this.sessionType = INVALID_SESSION_TYPE
        }
    }

    fun updateRequestToken(requestToken: String) {

        this.requestToken = requestToken
    }

    companion object {

        val INVALID_SESSION_TYPE = -1
        val GUEST_SESSION_TYPE = 0
        val FULL_SESSION_TYPE = 1
    }
}
