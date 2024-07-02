package info.passdaily.holy_angles_staff.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class AcademicListModel(
    @SerializedName("AccademicDetails")
    val accademicDetails: List<AccademicDetail>
){
    @Keep
    data class AccademicDetail(
        @SerializedName("ACCADEMIC_ID")
        val aCCADEMICID: Int,
        @SerializedName("ACCADEMIC_STATUS")
        val aCCADEMICSTATUS: Int,
        @SerializedName("ACCADEMIC_TIME")
        val aCCADEMICTIME: String
    )
}