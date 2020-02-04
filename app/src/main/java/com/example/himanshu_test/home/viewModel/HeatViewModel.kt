package com.example.himanshu_test.home.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.himanshu_test.home.model.HeatModel
import com.example.himanshu_test.home.respository.TeamRepository
import com.example.himanshu_test.util.Utilities
import org.json.JSONObject


class HeatViewModel(application: Application) : AndroidViewModel(application) {

    val context = application
    private var heatListData: MutableLiveData<HeatModel>? = null
    private var heatStrData: String? = null
    private var teamRepository: TeamRepository = TeamRepository()
    var utilities: Utilities = Utilities(application)
    var showError = MutableLiveData<String>()

    init {
        heatListData = teamRepository.heatListData
        heatStrData = teamRepository.heatStrData
        getHeatData()
    }

    private fun getHeatData() {
        if (utilities.haveNetworkConnection(context)) {
            teamRepository.getHeatData()

            /**/
            try {
                val jsonString = "\"Teams\": {\n" +
                        "        \"4\": {\n" +
                        "            \"Name_Full\": \"India\",\n" +
                        "            \"Name_Short\": \"IND\",\n" +
                        "            \"Players\": {\n" +
                        "                \"3632\": {\n" +
                        "                    \"Position\": \"5\",\n" +
                        "                    \"Name_Full\": \"Dinesh Karthik\",\n" +
                        "                    \"Iskeeper\": true,\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"31.03\",\n" +
                        "                        \"Strikerate\": \"73.7\",\n" +
                        "                        \"Runs\": \"1738\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"\",\n" +
                        "                        \"Average\": \"0\",\n" +
                        "                        \"Economyrate\": \"0\",\n" +
                        "                        \"Wickets\": \"0\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"3722\": {\n" +
                        "                    \"Position\": \"2\",\n" +
                        "                    \"Name_Full\": \"Shikhar Dhawan\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"LHB\",\n" +
                        "                        \"Average\": \"45.36\",\n" +
                        "                        \"Strikerate\": \"93.59\",\n" +
                        "                        \"Runs\": \"5172\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"OB\",\n" +
                        "                        \"Average\": \"0\",\n" +
                        "                        \"Economyrate\": \"0\",\n" +
                        "                        \"Wickets\": \"0\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"3852\": {\n" +
                        "                    \"Position\": \"1\",\n" +
                        "                    \"Name_Full\": \"Rohit Sharma\",\n" +
                        "                    \"Iscaptain\": true,\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"47.88\",\n" +
                        "                        \"Strikerate\": \"88.46\",\n" +
                        "                        \"Runs\": \"7806\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"OB\",\n" +
                        "                        \"Average\": \"64.37\",\n" +
                        "                        \"Economyrate\": \"5.21\",\n" +
                        "                        \"Wickets\": \"8\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"4176\": {\n" +
                        "                    \"Position\": \"4\",\n" +
                        "                    \"Name_Full\": \"Ambati Rayudu\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"49.09\",\n" +
                        "                        \"Strikerate\": \"79.7\",\n" +
                        "                        \"Runs\": \"1571\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"OB\",\n" +
                        "                        \"Average\": \"41.33\",\n" +
                        "                        \"Economyrate\": \"6.14\",\n" +
                        "                        \"Wickets\": \"3\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"4532\": {\n" +
                        "                    \"Position\": \"6\",\n" +
                        "                    \"Name_Full\": \"Kedar Jadhav\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"44\",\n" +
                        "                        \"Strikerate\": \"108.39\",\n" +
                        "                        \"Runs\": \"968\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"OB\",\n" +
                        "                        \"Average\": \"31.45\",\n" +
                        "                        \"Economyrate\": \"4.97\",\n" +
                        "                        \"Wickets\": \"24\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"5132\": {\n" +
                        "                    \"Position\": \"10\",\n" +
                        "                    \"Name_Full\": \"Bhuvneshwar Kumar\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"15.16\",\n" +
                        "                        \"Strikerate\": \"74.24\",\n" +
                        "                        \"Runs\": \"470\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"RM\",\n" +
                        "                        \"Average\": \"35.89\",\n" +
                        "                        \"Economyrate\": \"4.98\",\n" +
                        "                        \"Wickets\": \"113\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"9844\": {\n" +
                        "                    \"Position\": \"9\",\n" +
                        "                    \"Name_Full\": \"Yuzvendra Chahal\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"11.33\",\n" +
                        "                        \"Strikerate\": \"52.3\",\n" +
                        "                        \"Runs\": \"34\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"LBG\",\n" +
                        "                        \"Average\": \"24.27\",\n" +
                        "                        \"Economyrate\": \"4.82\",\n" +
                        "                        \"Wickets\": \"68\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"63187\": {\n" +
                        "                    \"Position\": \"8\",\n" +
                        "                    \"Name_Full\": \"Kuldeep Yadav\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"LHB\",\n" +
                        "                        \"Average\": \"15.6\",\n" +
                        "                        \"Strikerate\": \"56.11\",\n" +
                        "                        \"Runs\": \"78\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"SLC\",\n" +
                        "                        \"Average\": \"20.64\",\n" +
                        "                        \"Economyrate\": \"4.77\",\n" +
                        "                        \"Wickets\": \"77\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"63751\": {\n" +
                        "                    \"Position\": \"7\",\n" +
                        "                    \"Name_Full\": \"Hardik Pandya\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"28.58\",\n" +
                        "                        \"Strikerate\": \"113.38\",\n" +
                        "                        \"Runs\": \"686\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"RMF\",\n" +
                        "                        \"Average\": \"40.42\",\n" +
                        "                        \"Economyrate\": \"5.51\",\n" +
                        "                        \"Wickets\": \"42\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"65867\": {\n" +
                        "                    \"Position\": \"11\",\n" +
                        "                    \"Name_Full\": \"Khaleel Ahmed\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"4.5\",\n" +
                        "                        \"Strikerate\": \"52.94\",\n" +
                        "                        \"Runs\": \"9\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"LM\",\n" +
                        "                        \"Average\": \"30.72\",\n" +
                        "                        \"Economyrate\": \"5.36\",\n" +
                        "                        \"Wickets\": \"11\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"66818\": {\n" +
                        "                    \"Position\": \"3\",\n" +
                        "                    \"Name_Full\": \"Shubman Gill\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"9\",\n" +
                        "                        \"Strikerate\": \"42.85\",\n" +
                        "                        \"Runs\": \"9\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"OB\",\n" +
                        "                        \"Average\": \"0\",\n" +
                        "                        \"Economyrate\": \"0\",\n" +
                        "                        \"Wickets\": \"0\"\n" +
                        "                    }\n" +
                        "                }\n" +
                        "            }\n" +
                        "        },\n" +
                        "        \"5\": {\n" +
                        "            \"Name_Full\": \"New Zealand\",\n" +
                        "            \"Name_Short\": \"NZ\",\n" +
                        "            \"Players\": {\n" +
                        "                \"3752\": {\n" +
                        "                    \"Position\": \"4\",\n" +
                        "                    \"Name_Full\": \"Ross Taylor\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"48.1\",\n" +
                        "                        \"Strikerate\": \"83.3\",\n" +
                        "                        \"Runs\": \"7890\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"OB\",\n" +
                        "                        \"Average\": \"0\",\n" +
                        "                        \"Economyrate\": \"5\",\n" +
                        "                        \"Wickets\": \"0\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"4330\": {\n" +
                        "                    \"Position\": \"3\",\n" +
                        "                    \"Name_Full\": \"Kane Williamson\",\n" +
                        "                    \"Iscaptain\": true,\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"45.7\",\n" +
                        "                        \"Strikerate\": \"83.13\",\n" +
                        "                        \"Runs\": \"5439\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"OB\",\n" +
                        "                        \"Average\": \"35.6\",\n" +
                        "                        \"Economyrate\": \"5.42\",\n" +
                        "                        \"Wickets\": \"35\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"4338\": {\n" +
                        "                    \"Position\": \"11\",\n" +
                        "                    \"Name_Full\": \"Trent Boult\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"10.21\",\n" +
                        "                        \"Strikerate\": \"76.47\",\n" +
                        "                        \"Runs\": \"143\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"LFM\",\n" +
                        "                        \"Average\": \"25.12\",\n" +
                        "                        \"Economyrate\": \"5.12\",\n" +
                        "                        \"Wickets\": \"138\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"4964\": {\n" +
                        "                    \"Position\": \"1\",\n" +
                        "                    \"Name_Full\": \"Martin Guptill\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"42.3\",\n" +
                        "                        \"Strikerate\": \"86.72\",\n" +
                        "                        \"Runs\": \"6176\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"OB\",\n" +
                        "                        \"Average\": \"24.5\",\n" +
                        "                        \"Economyrate\": \"5.39\",\n" +
                        "                        \"Wickets\": \"4\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"10167\": {\n" +
                        "                    \"Position\": \"5\",\n" +
                        "                    \"Name_Full\": \"Tom Latham\",\n" +
                        "                    \"Iskeeper\": true,\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"LHB\",\n" +
                        "                        \"Average\": \"33.31\",\n" +
                        "                        \"Strikerate\": \"82.69\",\n" +
                        "                        \"Runs\": \"2299\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"RM\",\n" +
                        "                        \"Average\": \"0\",\n" +
                        "                        \"Economyrate\": \"0\",\n" +
                        "                        \"Wickets\": \"0\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"10172\": {\n" +
                        "                    \"Position\": \"6\",\n" +
                        "                    \"Name_Full\": \"James Neesham\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"LHB\",\n" +
                        "                        \"Average\": \"30.12\",\n" +
                        "                        \"Strikerate\": \"102.63\",\n" +
                        "                        \"Runs\": \"934\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"RFM\",\n" +
                        "                        \"Average\": \"34.58\",\n" +
                        "                        \"Economyrate\": \"6.46\",\n" +
                        "                        \"Wickets\": \"41\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"11703\": {\n" +
                        "                    \"Position\": \"8\",\n" +
                        "                    \"Name_Full\": \"Colin de Grandhomme\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"28.21\",\n" +
                        "                        \"Strikerate\": \"104.49\",\n" +
                        "                        \"Runs\": \"395\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"RFM\",\n" +
                        "                        \"Average\": \"46.18\",\n" +
                        "                        \"Economyrate\": \"5.13\",\n" +
                        "                        \"Wickets\": \"16\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"11706\": {\n" +
                        "                    \"Position\": \"9\",\n" +
                        "                    \"Name_Full\": \"Todd Astle\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"34.50\",\n" +
                        "                        \"Strikerate\": \"113.11\",\n" +
                        "                        \"Runs\": \"69\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"LB\",\n" +
                        "                        \"Average\": \"19.87\",\n" +
                        "                        \"Economyrate\": \"5.3\",\n" +
                        "                        \"Wickets\": \"8\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"57594\": {\n" +
                        "                    \"Position\": \"2\",\n" +
                        "                    \"Name_Full\": \"Henry Nicholls\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"LHB\",\n" +
                        "                        \"Average\": \"35.6\",\n" +
                        "                        \"Strikerate\": \"87.42\",\n" +
                        "                        \"Runs\": \"890\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"OB\",\n" +
                        "                        \"Average\": \"0\",\n" +
                        "                        \"Economyrate\": \"0\",\n" +
                        "                        \"Wickets\": \"0\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"57903\": {\n" +
                        "                    \"Position\": \"7\",\n" +
                        "                    \"Name_Full\": \"Mitchell Santner\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"LHB\",\n" +
                        "                        \"Average\": \"27.17\",\n" +
                        "                        \"Strikerate\": \"89.95\",\n" +
                        "                        \"Runs\": \"788\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"SLO\",\n" +
                        "                        \"Average\": \"34.63\",\n" +
                        "                        \"Economyrate\": \"4.88\",\n" +
                        "                        \"Wickets\": \"60\"\n" +
                        "                    }\n" +
                        "                },\n" +
                        "                \"60544\": {\n" +
                        "                    \"Position\": \"10\",\n" +
                        "                    \"Name_Full\": \"Matt Henry\",\n" +
                        "                    \"Batting\": {\n" +
                        "                        \"Style\": \"RHB\",\n" +
                        "                        \"Average\": \"17.60\",\n" +
                        "                        \"Strikerate\": \"99.43\",\n" +
                        "                        \"Runs\": \"176\"\n" +
                        "                    },\n" +
                        "                    \"Bowling\": {\n" +
                        "                        \"Style\": \"RFM\",\n" +
                        "                        \"Average\": \"27.21\",\n" +
                        "                        \"Economyrate\": \"5.66\",\n" +
                        "                        \"Wickets\": \"71\"\n" +
                        "                    }\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "    }" //your json string here

                val jObject = JSONObject().getJSONObject("Players")
                val keys = jObject.keys()
                while (keys.hasNext()) {
                    val key = keys.next()
                    Log.v("**********", "**********")
                    Log.v("category key", key)
                    val innerJObject = jObject.getJSONObject(key)
                    val innerKeys = innerJObject.keys()
                    while (innerKeys.hasNext()) {
                        val innerKkey = keys.next()
                        val value = innerJObject.getString(innerKkey)
                        Log.v("key = $key", "value = $value")
                    }
                }
            } catch (e: Exception) {
                println("Himanshu JsonObject Exception : $e")
            }

        } else {
            showError.value = "No Internet Connection"
        }
    }

    fun getHeatRepository(): LiveData<HeatModel>? {
        return heatListData
    }

}