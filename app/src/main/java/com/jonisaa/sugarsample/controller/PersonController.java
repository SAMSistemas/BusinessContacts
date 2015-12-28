package com.jonisaa.sugarsample.controller;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.jonisaa.sugarsample.controller.base.Controller;
import com.jonisaa.sugarsample.model.Person;
import com.orm.SugarRecord;

import java.util.List;

import javax.inject.Singleton;

/**
 * @author jonatan.salas
 */
@Singleton
public class PersonController implements Controller<Person> {
    private static final Class<Person> clazz = Person.class;

    @NonNull
    @Override
    public Long insert(@NonNull Person object) {
        return SugarRecord.save(object);
    }

    @Nullable
    @Override
    public Person findById(@NonNull Long id) {
        return SugarRecord.findById(clazz, id);
    }

    @Nullable
    @Override
    public List<Person> listAll() {
        return SugarRecord.listAll(clazz);
    }

    @NonNull
    @Override
    public Long update(@NonNull Person object) {
        return SugarRecord.save(object);
    }

    @NonNull
    @Override
    public Boolean delete(@NonNull Person object) {
        return SugarRecord.delete(object);
    }

    @Override
    public int deleteAll() {
        return SugarRecord.deleteAll(clazz);
    }

    @Override
    public long getCount() {
        return SugarRecord.count(clazz);
    }
}
