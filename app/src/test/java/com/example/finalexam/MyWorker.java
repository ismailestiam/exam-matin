
// MyWorker.java (Étape 6 : WorkManager)
package com.example.finalexam;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker extends Worker {
    public MyWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override
    public Result doWork() {
        Log.d("MyWorker", "Tâche en arrière-plan exécutée");
        return Result.success();
    }
}
