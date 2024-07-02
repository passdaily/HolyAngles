package info.passdaily.holy_angles_staff.lib

interface ImageUploadCallback {
    fun onProgressUpdate(percentage: Int)
    fun onError(message: String?)
    fun onSuccess(message: String?)
}