package com.example.himanshu_test.home.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class HeatModel {

    @SerializedName("Teams")
    @Expose
    var teams: Teams? = null

    class Teams {
        @SerializedName("4")
        @Expose
        var _4: _4? = null
        @SerializedName("5")
        @Expose
        var _5: _5? = null
    }

    class _4 {
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Name_Short")
        @Expose
        var nameShort: String? = null
        @SerializedName("Players")
        @Expose
        var players: Players? = null
    }

    class _5 {
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Name_Short")
        @Expose
        var nameShort: String? = null
        @SerializedName("Players")
        @Expose
        var players: Players_? = null
    }

    class Players {
        @SerializedName("3852")
        @Expose
        var _3852: _3852? = null
        @SerializedName("3722")
        @Expose
        var _3722: _3722? = null
        @SerializedName("66818")
        @Expose
        var _66818: _66818? = null
        @SerializedName("4176")
        @Expose
        var _4176: _4176? = null
        @SerializedName("3632")
        @Expose
        var _3632: _3632? = null
        @SerializedName("4532")
        @Expose
        var _4532: _4532? = null
        @SerializedName("63751")
        @Expose
        var _63751: _63751? = null
        @SerializedName("63187")
        @Expose
        var _63187: _63187? = null
        @SerializedName("9844")
        @Expose
        var _9844: _9844? = null
        @SerializedName("5132")
        @Expose
        var _5132: _5132? = null
        @SerializedName("65867")
        @Expose
        var _65867: _65867? = null
    }

    class Players_ {
        @SerializedName("4964")
        @Expose
        var _4964: _4964? = null
        @SerializedName("57594")
        @Expose
        var _57594: _57594? = null
        @SerializedName("4330")
        @Expose
        var _4330: _4330? = null
        @SerializedName("3752")
        @Expose
        var _3752: _3752? = null
        @SerializedName("10167")
        @Expose
        var _10167: _10167? = null
        @SerializedName("10172")
        @Expose
        var _10172: _10172? = null
        @SerializedName("57903")
        @Expose
        var _57903: _57903? = null
        @SerializedName("11703")
        @Expose
        var _11703: _11703? = null
        @SerializedName("11706")
        @Expose
        var _11706: _11706? = null
        @SerializedName("60544")
        @Expose
        var _60544: _60544? = null
        @SerializedName("4338")
        @Expose
        var _4338: _4338? = null
    }

    class _3852 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Iscaptain")
        @Expose
        var iscaptain: Boolean? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling? = null
    }

    class _3722 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting_? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling_? = null
    }

    class _66818 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting__? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling__? = null
    }

    class _4176 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting___? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling___? = null
    }

    class _3632 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Iskeeper")
        @Expose
        var iskeeper: Boolean? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting____? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling____? = null
    }

    class _4532 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting_____? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling_____? = null
    }

    class _63751 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting______? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling______? = null
    }

    class _63187 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting_______? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling_______? = null
    }

    class _9844 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling________? = null
    }

    class _5132 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting_________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling_________? = null
    }

    class _65867 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting__________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling__________? = null
    }

    class _4964 {
        @SerializedName("Position")
        @Expose
        var position: String? = null

        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null

        @SerializedName("Batting")
        @Expose
        var batting: Batting___________? = null

        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling___________? = null
    }

    class _57594 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting____________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling____________? = null
    }

    class _4330 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting_____________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling_____________? = null
    }

    class _3752 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting______________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling______________? = null
    }

    class _10167 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting_______________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling_______________? = null
    }

    class _10172 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting________________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling________________? = null
    }

    class _57903 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting_________________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling_________________? = null
    }

    class _11703 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting__________________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling__________________? = null
    }

    class _11706 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting___________________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling___________________? = null
    }

    class _60544 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting____________________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling____________________? = null
    }

    class _4338 {
        @SerializedName("Position")
        @Expose
        var position: String? = null
        @SerializedName("Name_Full")
        @Expose
        var nameFull: String? = null
        @SerializedName("Batting")
        @Expose
        var batting: Batting_____________________? = null
        @SerializedName("Bowling")
        @Expose
        var bowling: Bowling_____________________? = null
    }

    class Batting {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting_ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting__ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting___ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting____ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting_____ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting______ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting_______ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting_________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting__________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting___________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting____________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting_____________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting______________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting_______________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting_________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting__________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting___________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting____________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Batting_____________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Strikerate")
        @Expose
        var strikerate: String? = null
        @SerializedName("Runs")
        @Expose
        var runs: String? = null
    }

    class Bowling {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling_ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling__ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling___ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling____ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling_____ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling______ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling_______ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling_________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling__________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling___________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling____________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling_____________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling______________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling_______________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling_________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling__________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling___________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling____________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }

    class Bowling_____________________ {
        @SerializedName("Style")
        @Expose
        var style: String? = null
        @SerializedName("Average")
        @Expose
        var average: String? = null
        @SerializedName("Economyrate")
        @Expose
        var economyrate: String? = null
        @SerializedName("Wickets")
        @Expose
        var wickets: String? = null
    }
}