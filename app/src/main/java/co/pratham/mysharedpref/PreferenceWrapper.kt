package co.pratham.mysharedpref

import co.pratham.mysharedpref.database.KeyEntity
import co.pratham.mysharedpref.database.PreferenceDao

class PreferenceWrapper(private val dao: PreferenceDao) {

    fun putBoolean(key:String,value: Boolean){
        addEntityInDatabase(key,value.toString())
    }

    private fun addEntityInDatabase(key: String,value:String){
        val keyEntity =dao.fetchKey(key)
        if(keyEntity != null){
            dao.updateKey(key,value)
        }else{
            dao.insertKey(KeyEntity(key,value))
        }
    }

    fun putString(key:String,value: String){
        addEntityInDatabase(key,value)
    }
    fun putFloat(key:String,value: Float){
        addEntityInDatabase(key,value.toString())
    }
    fun putInteger(key:String,value: Int){
        addEntityInDatabase(key,value.toString())
    }

    fun getBoolean(key:String,default:Boolean) : Boolean{
        val entity = dao.fetchKey(key)
        if(entity == null){
            return default
        }else{
            return entity.value.toBoolean()
        }
    }

    fun hasKey(key:String): Boolean{
        val entity = dao.fetchKey(key) ?: return false
        return true;
    }

    fun getString(key: String,default: String): String{
        val entity = dao.fetchKey(key)
        if(entity == null){
            return default
        }else{
            return entity.value
        }
    }

    fun getInteger(key:String,default:Int):Int{
        val entity = dao.fetchKey(key)
        if(entity == null){
            return default
        }else{
            return entity.value.toInt()
        }
    }

    fun getFloat(key:String,default:Float):Float{
        val entity = dao.fetchKey(key)
        if(entity == null){
            return default
        }else{
            return entity.value.toFloat()
        }
    }

}