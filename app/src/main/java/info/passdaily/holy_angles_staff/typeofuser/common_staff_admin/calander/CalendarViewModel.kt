package info.passdaily.holy_angles_staff.typeofuser.common_staff_admin.calander

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import info.passdaily.holy_angles_staff.MainRepository
import info.passdaily.holy_angles_staff.services.Resource
import kotlinx.coroutines.Dispatchers

class CalendarViewStaffModel(private val mainRepository: MainRepository) : ViewModel() {
    var TAG = "CalendarViewModel"

    fun getActivityListStaff(adminId : Int,academicId: Int) = liveData(
        Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getActivityListStaff(adminId,academicId)))
        } catch (exception: Exception) {
            Log.i(TAG, "exception $exception")
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }

    fun getHolidayListStaff(adminId : Int,academicId: Int) = liveData(Dispatchers.IO) {

        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getHolidayListStaff(adminId,academicId)))
        } catch (exception: Exception) {
            Log.i(TAG, "exception $exception")
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}