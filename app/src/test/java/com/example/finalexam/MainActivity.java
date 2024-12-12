
// MainActivity.java (Étape 2 : Point d'entrée)
package com.example.finalexam;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Étape 3 : Affichage de messages
        Toast.makeText(this, "Bienvenue sur FinalExamApp!", Toast.LENGTH_LONG).show();

        findViewById(android.R.id.content).post(() -> {
            Snackbar.make(findViewById(android.R.id.content), "Voici un exemple de Snackbar", Snackbar.LENGTH_SHORT).show();
        });
    }
}
