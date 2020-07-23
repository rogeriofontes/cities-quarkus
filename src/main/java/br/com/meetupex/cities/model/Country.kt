package br.com.meetupex.cities.model

class Country {
    var name: String? = null
    var alpha2Code: String? = null
    var capital: String? = null
    var currencies: List<Currency>? = null

    class Currency {
        var code: String? = null
        var name: String? = null
        var symbol: String? = null
    }
}