package dev.danielkeyes.testapp.api

import retrofit2.http.GET
import java.util.*
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.Retrofit

interface RandomUserAPI {
    @GET("")
    suspend fun getRandomUser(): RandomUser

    companion object {
        private const val BASE_URL = "https://randomuser.me/api/"

        fun create() : RandomUserAPI {

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(RandomUserAPI::class.java)
        }
    }
}

//var apiService: RandomUserAPI = retrofit.create(RandomUserAPI::class.java)

class Name {
    var title: String? = null
    var first: String? = null
    var last: String? = null

    override fun toString(): String {
        return "Name(title=$title, first=$first, last=$last)"
    }
}

class Street {
    var number = 0
    var name: String? = null

    override fun toString(): String {
        return "Street(number=$number, name=$name)"
    }
}

class Coordinates {
    var latitude: String? = null
    var longitude: String? = null

    override fun toString(): String {
        return "Coordinates(latitude=$latitude, longitude=$longitude)"
    }
}

class Timezone {
    var offset: String? = null
    var description: String? = null

    override fun toString(): String {
        return "Timezone(offset=$offset, description=$description)"
    }
}

class Location {
    var street: Street? = null
    var city: String? = null
    var state: String? = null
    var country: String? = null
    var postcode = 0
    var coordinates: Coordinates? = null
    var timezone: Timezone? = null

    override fun toString(): String {
        return "Location(street=$street, city=$city, state=$state, country=$country, postcode=$postcode, coordinates=$coordinates, timezone=$timezone)"
    }
}

class Login {
    var uuid: String? = null
    var username: String? = null
    var password: String? = null
    var salt: String? = null
    var md5: String? = null
    var sha1: String? = null
    var sha256: String? = null

    override fun toString(): String {
        return "Login(uuid=$uuid, username=$username, password=$password, salt=$salt, md5=$md5, sha1=$sha1, sha256=$sha256)"
    }
}

class Dob {
    var date: Date? = null
    var age = 0

    override fun toString(): String {
        return "Dob(date=$date, age=$age)"
    }
}

class Registered {
    var date: Date? = null
    var age = 0

    override fun toString(): String {
        return "Registered(date=$date, age=$age)"
    }
}

class Id {
    var name: String? = null
    var value: String? = null

    override fun toString(): String {
        return "Id(name=$name, value=$value)"
    }
}

class Picture {
    var large: String? = null
    var medium: String? = null
    var thumbnail: String? = null

    override fun toString(): String {
        return "Picture(large=$large, medium=$medium, thumbnail=$thumbnail)"
    }
}

class RandomUser {
    var gender: String? = null
    var name: Name? = null
    var location: Location? = null
    var email: String? = null
    var login: Login? = null
    var dob: Dob? = null
    var registered: Registered? = null
    var phone: String? = null
    var cell: String? = null
    var id: Id? = null
    var picture: Picture? = null
    var nat: String? = null

    override fun toString(): String {
        return "RandomUser(gender=$gender, name=$name, location=$location, email=$email, login=$login, dob=$dob, registered=$registered, phone=$phone, cell=$cell, id=$id, picture=$picture, nat=$nat)"
    }
}

class Info {
    var seed: String? = null
    var results = 0
    var page = 0
    var version: String? = null

    override fun toString(): String {
        return "Info(seed=$seed, results=$results, page=$page, version=$version)"
    }
}

