package info.passdaily.holy_angles_staff.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class FileResultModel(
    @SerializedName("DETAILS")
    val dETAILS: String,
    @SerializedName("RESULT")
    val rESULT: String
)