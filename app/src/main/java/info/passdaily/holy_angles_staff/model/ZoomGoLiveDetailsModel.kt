package info.passdaily.holy_angles_staff.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ZoomGoLiveDetailsModel(
    @SerializedName("AccademicDetails")
    var accademicDetails: List<AccademicDetail>,
    @SerializedName("ClassSubjectDetails")
    var classSubjectDetails: List<ClassSubjectDetail>,
    @SerializedName("ZoomLoginDetails")
    var zoomLoginDetails: List<ZoomLoginDetail>,
    @SerializedName("ZoomLoginKeyDetails")
    var zoomLoginKeyDetails: List<ZoomLoginKeyDetail>
) {
    @Keep
    data class AccademicDetail(
        @SerializedName("ACCADEMIC_ID")
        var aCCADEMICID: Int,
        @SerializedName("ACCADEMIC_STATUS")
        var aCCADEMICSTATUS: Int,
        @SerializedName("ACCADEMIC_TIME")
        var aCCADEMICTIME: String
    )

    @Keep
    data class ClassSubjectDetail(
        @SerializedName("CLASS_ID")
        var cLASSID: Int,
        @SerializedName("CLASS_NAME")
        var cLASSNAME: String,
        @SerializedName("CLASS_SECTION")
        var cLASSSECTION: String,
        @SerializedName("CLASS_SUBJECT_ID")
        var cLASSSUBJECTID: String,
        @SerializedName("CLASS_SUBJECT_NAME")
        var cLASSSUBJECTNAME: String,
        @SerializedName("SUBJECT_ID")
        var sUBJECTID: Int,
        @SerializedName("SUBJECT_NAME")
        var sUBJECTNAME: String,
        @SerializedName("SUBJECT_STATUS")
        var sUBJECTSTATUS: Int
    )

    @Keep
    data class ZoomLoginDetail(
        @SerializedName("ADMIN_ID")
        var aDMINID: Int,
        @SerializedName("CREATED_DATE")
        var cREATEDDATE: String,
        @SerializedName("Z_APP_KEY")
        var zAPPKEY: String,
        @SerializedName("Z_APP_SECRET_KEY")
        var zAPPSECRETKEY: String,
        @SerializedName("Z_CREDENTIAL_ID")
        var zCREDENTIALID: Int,
        @SerializedName("Z_CREDENTIAL_STATUS")
        var zCREDENTIALSTATUS: Int,
//        @SerializedName("Z_FIELD_1")
//        var zFIELD1: String,
//        @SerializedName("Z_FIELD_2")
//        var zFIELD2: String,
        @SerializedName("Z_JWT_TOKEN")
        var zJWTTOKEN: String,
        @SerializedName("Z_PASSOWRD")
        var zPASSOWRD: String,
//        @SerializedName("Z_USER_ID")
//        var zUSERID: String,
        @SerializedName("Z_USER_NAME")
        var zUSERNAME: String,
        @SerializedName("Z_ZOOM_ACCESS_TOKEN")
        var zZOOMACCESSTOKEN: String,
        @SerializedName("AccountID")
        var accountID: String,
        @SerializedName("ClientID")
        var clientID: String,
        @SerializedName("ClientSecret")
        var clientSecret: String
    )

    @Keep
    data class ZoomLoginKeyDetail(
        @SerializedName("CREATED_BY")                               ///"Z_KEY_ID": 1,
        var cREATEDBY: Int,                               ///      "Z_KEY_TITLE": "FSDFG",
        @SerializedName("CREATED_DATE")                               ///      "Z_USER_NAME": "SDGVSDFGV",
        var cREATEDDATE: String,                               ///      "Z_PASSOWRD": "SDGVSD",
        @SerializedName("DELETE_BY")                               ///      "CREATED_DATE": "2023-10-28T11:27:40.55",
        var dELETEBY: Any,                               ///      "CREATED_BY": 1,
        @SerializedName("DELETE_DATE")                               ///      "UPDATED_DATE": null,
        var dELETEDATE: Any,                               ///      "UPDATED_BY": null,
        @SerializedName("UPDATED_BY")                               ///      "DELETE_DATE": null,
        var uPDATEDBY: Int,                               ///      "DELETE_BY": null,
        @SerializedName("UPDATED_DATE")                               ///      "Z_KEY_STATUS": 1
        var uPDATEDDATE: String,                               ///
        @SerializedName("Z_KEY_ID")                               ///
        var zKEYID: Int,                               ///
        @SerializedName("Z_KEY_STATUS")                               ///
        var zKEYSTATUS: Int,                               ///
        @SerializedName("Z_KEY_TITLE")
        var zKEYTITLE: String,
        @SerializedName("Z_PASSOWRD")
        var zPASSOWRD: String,
        @SerializedName("Z_USER_NAME")
        var zUSERNAME: String
    )
}