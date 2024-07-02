package info.passdaily.holy_angles_staff.services.retrofit

interface ApiCallBack<T> {

    fun  onFailure(error : String)
    fun  onError(error : String)
    fun  onSuccess(response : T)
}