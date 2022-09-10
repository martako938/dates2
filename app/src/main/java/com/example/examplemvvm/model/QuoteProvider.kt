package com.example.examplemvvm.model

class QuoteProvider {
    companion object {
        fun random():QuoteModel{
            val position:Int = (0..14).random()
            return quotes[position]
        }

        private val quotes = listOf<QuoteModel>(
            QuoteModel(
                quote = "Hola que tal. Que agradable plataforma. No soy un robot",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "Me dedico al desarrollo de software, programar me gusta mucho. Mis pasatiempos son ir al cine y  jugar videojuegos",
                author = "Raul Cabrera"
            ),
            QuoteModel(
                quote = "Vendedor de autos de todo tipo, me gusta salir de fiesta en la ciudad de Los Santos",
                author = "Carl Jhonson"
            ),
            QuoteModel(
                quote = "Soy un poco introvertido pero si nos conocemos a fondo, soy una buena opción para charlar",
                author = "Pedro Paramo"
            ),
            QuoteModel(
                quote = "Tengo una compañia de software y me gusta mucho trabajar en ella. Bienvenida nueva dueña de Microsoft",
                author = "Bill Gates"
            ),
            QuoteModel(
                quote = "Si tu quieres, podemos ir al espacio exterior, o solo dar un paseo en mi Tesla Truck",
                author = "Elon Musk"
            ),
            QuoteModel(
                quote = "Desde hace un tiempo que no salgo con nadie. Me gustaria poder encontrar el amor aqui",
                author = "Bruce Banner"
            ),
            QuoteModel(
                quote = "Me gusta el algebra y quiero estudiar en el MIT. Si te llamas Mary Jane... perfecto",
                author = "Peter Parker"
            ),
            QuoteModel(
                quote = "Mi vida es algo complicada pero me gusta hacer ejercicio y recordar a mis antepasados",
                author = "Altair"
            ),
            QuoteModel(
                quote = "Te gustaria sali a bailar? la music y el baile es lo mio nena. Podemo ir de antro cuando quiera",
                author = "Benito Martinez BB"
            ),
            QuoteModel(
                quote = "Agregame a mi red social y verás que soy el indicado en tu vida, no busques mas!!",
                author = "Mark Zuckerberg"
            ),
            QuoteModel(
                quote = "Jugue fútbol en el Barcelona y estoy dispuesto a ganar este mundial 2022 por ti ",
                author = "Leo Messi"
            ),
            QuoteModel(
                quote = "El cine el lo mio, vamos a ver juntos alguna pelicula de ciencia ficción",
                author = "Steven Spielberg"
            ),
            QuoteModel(
                quote = "Fui presidente de Estados Unidos en 2009, me gustaria mucho volver a la casa blanca",
                author = "Barack Obama"
            ),
            QuoteModel(
                quote = "Locura es hacer lo mismo una y otra vez esperando obtener resultados diferentes",
                author = "Albert Einstein"
            )
        )
    }
}