package com.example.scotl.Login;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

import Frameworks.Database.SQLite.SQLiteDAO;
import Policy.Adapters.MyLog;
import Policy.BusinessRules.DatabaseAccess;
import Policy.BusinessRules.UserType;
import Policy.Entity.Person;

public class RegisterUserTest
{
    @Test
    public void ExecuteRegisterUserTest()
    {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        SQLiteDAO database = new SQLiteDAO(appContext);

        Boolean result = database.TryRegisterUser
                (
                        "Pedro3",
                        "123",
                        new Person
                                (
                                        "11111111112",
                                        "User Person",
                                        "0800",
                                        "Today"
                                ),
                        UserType.WAREHOUSE_MANAGER
                );

        MyLog.LogMessage(result.toString());
    }
}
