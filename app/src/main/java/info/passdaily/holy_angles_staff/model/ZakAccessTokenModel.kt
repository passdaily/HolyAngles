package info.passdaily.holy_angles_staff.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ZakAccessTokenModel(
    @SerializedName("token")
    var token: String
)