package uz.gita.tdddemo.data.source.local

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import uz.gita.tdddemo.utils.BooleanPreference
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalStorage @Inject constructor(@ApplicationContext context: Context) {
    private val pref = context.getSharedPreferences("LocalStorage", Context.MODE_PRIVATE)

    var isSigned: Boolean by BooleanPreference(pref)
}