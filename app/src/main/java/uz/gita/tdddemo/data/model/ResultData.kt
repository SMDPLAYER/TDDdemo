package uz.gita.tdddemo.data.model

sealed class ResultData<T> {
    class Success<T>(data: T?) : ResultData<T>()
    class Error(throwable: Throwable) : ResultData<Nothing>()
    class FailureMessage<T>(message: String) : ResultData<T>()
    class FailureResource<T>(resId: Int) : ResultData<Nothing>()
}