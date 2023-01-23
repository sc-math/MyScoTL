package com.example.scotl.CRUDBatch;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

import Frameworks.Database.SQLite.SQLiteDAO;
import Policy.Adapters.MyLog;
import Policy.BusinessRules.DatabaseAccess;
import Policy.Entity.Batch;

public class RegisterBatchTest
{
    @Test
    public void ExecuteRegisterBatchTest()
    {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        SQLiteDAO database = new SQLiteDAO(appContext);
        DatabaseAccess.batchOperationsInterface = database;

        Boolean result = DatabaseAccess.batchOperationsInterface.TryRegisterBatch
        (
            new Batch
            (
                "9876",
                "20/01/2023"
            )
        );

        MyLog.LogMessage(result.toString());
    }
}
