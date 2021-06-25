package com.empresa.consultadni.database;

import android.content.Context;

import androidx.room.Database;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.empresa.consultadni.database.entidades.Personas;
import com.empresa.consultadni.utils.Utils;

@Database(
        entities = {
                Personas.tb.class
        },
        version = 1,
        exportSchema = false
)

public abstract class Datos extends RoomDatabase {

    public static Datos INSTANCE;

    /**Tablas**/
    public abstract Personas.sql tb_personas();

    public static Datos DB(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, Datos.class, Utils.var.DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return  INSTANCE;
    }
}
