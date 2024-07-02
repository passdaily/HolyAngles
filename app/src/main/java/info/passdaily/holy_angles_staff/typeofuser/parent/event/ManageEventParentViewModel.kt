package info.passdaily.holy_angles_staff.typeofuser.parent.event

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import info.passdaily.holy_angles_staff.MainRepository
import info.passdaily.holy_angles_staff.services.Resource
import kotlinx.coroutines.Dispatchers

class ManageEventParentViewModel(private val mainRepository: MainRepository) : ViewModel() {

    var TAG = "ManageEventViewModel"
    fun getManageEventsParent(accademicId: Int, classId: Int,studentId: Int) = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getParentEventListAll(accademicId, classId,studentId)))
        } catch (exception: Exception) {
            Log.i(TAG, "exception $exception")
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }

}