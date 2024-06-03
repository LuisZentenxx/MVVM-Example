package com.example.mvvm_example.model

class QuoteProvider {
    // Permite acceder a los miembros de la clase sin necesidad de crear una instancia.
    companion object {

        fun random():QuoteModel{
            val position = (0..6).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel("La imaginación es más importante que el conocimiento.", "Albert Einstein"),
            QuoteModel("El precio de la libertad es la vigilancia eterna.", "Thomas Jefferson"),
            QuoteModel("El software es como el sexo; es mejor cuando es gratis.", "Linus Torvald"),
            QuoteModel("La inteligencia artificial es la nueva electricidad.", "Andrew Ng"),
            QuoteModel("La programación es el arte de hacer lo imposible posible.", "L.H. Otero"),
            QuoteModel(
                "La ciencia sin religión está coja, la religión sin ciencia está ciega.",
                "Albert Einstein"
            ),
            QuoteModel("El precio de la grandeza es la responsabilidad.", "Winston Churchill"),
        )
    }
}