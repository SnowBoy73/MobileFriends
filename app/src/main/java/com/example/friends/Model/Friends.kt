package com.example.friends.Model


class Friends {

    val mFriends = arrayOf<BEFriend>(
                         BEFriend("Capt J", "123", true, "45 Bumpy Lane"),
                         BEFriend("Freddo", "1234", false, "93 Apple Pie Rd"),
                         BEFriend("Jerry", "12345", true, "5 Flat Street"),
                         BEFriend("Bubba Jin", "12345678", true, "83 Fluffy Ave"),
                         BEFriend("Rob Dumpty", "23456789", true, "The House"),
                         BEFriend("Snowy", "87654321", false, "The South Pole"),

    )

    fun getAll(): Array<BEFriend> = mFriends


    fun getAllNames(): Array<String>  =  mFriends.map { aFriend -> aFriend.name }.toTypedArray()
    fun getAllNumbers(): Array<String>  =  mFriends.map { aFriend -> aFriend.phone }.toTypedArray()
    fun getAllAddresses(): Array<String>  =  mFriends.map { aFriend -> aFriend.address }.toTypedArray()


}