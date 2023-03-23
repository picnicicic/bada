package com.example.aaa

import android.provider.ContactsContract.CommonDataKinds.Email

data class User(

    var name: String,
    var email: String,
    var uId: String
) {
    constructor(): this("", "", "")
}
