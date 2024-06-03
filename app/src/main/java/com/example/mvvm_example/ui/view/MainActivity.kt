package com.example.mvvm_example.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer // Importa Observer para observar los cambios en LiveData
import com.example.mvvm_example.databinding.ActivityMainBinding // Importa el archivo de diseño generado por el enlace de datos
import com.example.mvvm_example.ui.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel : QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Infla el diseño de la actividad utilizando el enlace de datos y lo asigna a la propiedad binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Establece el contenido de la actividad como la vista raíz del diseño inflado

        // Observa los cambios en el LiveData del ViewModel y actualiza la interfaz de usuario en consecuencia
        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text = it.quote // Establece el texto de la cita en el TextView correspondiente
            binding.tvAuthor.text = it.author // Establece el texto del autor en el TextView correspondiente
        })

        // Configura un Listener para el click del contenedor de vista que llama al método randomQuote() del ViewModel
        binding.viewContainer.setOnClickListener{ quoteViewModel.randomQuote() }
    }
}
