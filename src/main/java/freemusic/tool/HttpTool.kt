package freemusic.tool

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HttpTool {

    @Autowired
    private val okHttpClient: OkHttpClient? = null

    fun getJsonResultWithGet(url: String): String {
        val request = Request.Builder().url(url).build()
        val response: Response = okHttpClient!!.newCall(request).execute()
        if (!response.isSuccessful) return ""
        return response.body()!!.string()
    }
}